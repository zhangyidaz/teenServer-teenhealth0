package springboot.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class NewTeacherController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassService classService;
    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;
    @Autowired
    private GrandClassService grandClassService;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private TTeacherService tTeacherService;

    //  显示主页
    @RequestMapping(value = "/homepage1")
    @ResponseBody
    public CommonResult homepage( Model model,TClass tClass)throws Exception{
        List<TStudentCustom> studentList=studentService.listStudent();
        model.addAttribute("studentList",studentList);
        PageInfo pageInfo=new PageInfo(studentList,5);
        // 显示所有班级和老师姓名
        //获取班级id集合
        ArrayList classId=new ArrayList<>(classService.findAllTClassId());
        for(int i=0;i<classId.size(); i++){
            String ID=String.valueOf(classId.get(i));
            //查询班级下的学生人数
            Integer studentNum=studentService.selectStudentNum(ID);
            tClass.setStudentsNumber(studentNum);
            //更新班级的人数
            classService.updateStudentNum(ID,tClass);
        }
        //获取所有班级和老师姓名
        List<TClassCustom> classandTeacher=classService.findAllClassandTeacher();
        model.addAttribute("classandTeacher",classandTeacher);
        //获取所有设备信息
        List<TEquipment> allEquipment=equipmentService.listAllEquipment();
        model.addAttribute("allEquipment",allEquipment);
        return CommonResult.success();
    }

    //添加并保存学生信息
    @PostMapping("/addstudent1")
    @ResponseBody
    public CommonResult addStudent(@RequestBody TStudent tStudent,TClass tClass)throws Exception{
        if (studentService.insertStudent(tStudent)==1){
            String ID=tStudent.getClassId();
            Integer studentNum=studentService.selectStudentNum(ID);
            tClass.setStudentsNumber(studentNum);
            //更新班级的人数
            classService.updateStudentNum(ID,tClass);
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //修改学生信息
    @PostMapping("/editstudent1/{id}")
    @ResponseBody
    public CommonResult editStudent(@RequestBody TStudent tStudent,@PathVariable("id")String id)throws Exception{
        if(studentService.updateStudent(id, tStudent)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //删除学生信息
    @GetMapping("/deletestudent1/{id}")
    @ResponseBody
    public CommonResult deleteStudent(@PathVariable("id") String id)throws Exception{
        if (studentService.deleteStudent(id)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //班级管理
    /*@RequestMapping("/classList1")
    @ResponseBody
    public CommonResult ClassList(){
        List<TClassCustom> tClassCustom=grandClassService.listClasses();
        return CommonResult.success(tClassCustom);
    }*/
    @RequestMapping("/classList1")
    @ResponseBody
    public CommonResult ClassList(@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TClassCustom> tClassCustom=grandClassService.listClasses();
        PageInfo<TClassCustom> pageInfo1=new PageInfo<TClassCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //添加班级
    @PostMapping("/addclass1")
    @ResponseBody
    public CommonResult AddClass(@RequestBody TClass tClass){
        tClass.setIsend(0);
        tClass.setStudentsNumber(0);
        if(grandClassService.insertClass(tClass)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //修改保存班级信息
    @PostMapping("/editclass1/{id}")
    @ResponseBody
    public CommonResult SaveEditClass(@RequestBody TClass tClass,@PathVariable("id")String id){
        tClass.setId(id);
        if (classService.updateClassInfo(tClass)==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    //班级信息页面
    @PostMapping("/classinfo1/{classId}")
    @ResponseBody
    public CommonResult ClassInfo(@PathVariable("classId")String classId ,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        Collection<TStudent> tStudents=studentService.listStudentbyClass(classId);
        PageInfo<TStudent> tStudentPageInfo=new PageInfo<TStudent>(page.getResult());
        return CommonResult.success(tStudentPageInfo);
    }

    //根据年级id查询班级
    @PostMapping("/classlist1/{gradeId}")
    @ResponseBody
    public CommonResult GradeClass(@PathVariable("gradeId")String gradeid,@RequestBody PageInfo pageInfo){
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TClassCustom> tClassCustoms=classService.selectClassbyGradeid(gradeid);
        PageInfo<TClassCustom>tClassCustomPageInfo=new PageInfo<TClassCustom>(page.getResult());
        return CommonResult.success(tClassCustomPageInfo);
    }

    //根据年级id查询班级
    @GetMapping("/selectClassByGrade1/{gradeid}")
    @ResponseBody
    public CommonResult selectClassByGrade(@PathVariable("gradeid")String gradeid){
        List<TClassCustom> tClassCustoms=classService.selectClassbyGradeid(gradeid);
        return CommonResult.success(tClassCustoms);
    }

    //删除班级
    @GetMapping("/deleteclass1/{id}")
    @ResponseBody
    public CommonResult DeleteClass(@PathVariable("id")String classId){
        TClass tClass=classService.selectClassInfo(classId);
        if(tClass.getStudentsNumber()==0 || tClass.getStudentsNumber()==null){
            if (classService.deleteClass(classId)==1){
                return CommonResult.success();
            }else {
                return CommonResult.fail();
            }
        }else {
            return CommonResult.fail();
        }
    }


    //  显示学生列表
    @RequestMapping("/studentList1")
    @ResponseBody
    public CommonResult StudentInfoList(@RequestBody PageInfo pageInfo)throws Exception{
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TStudentCustom> studentList=studentService.listStudent();
        PageInfo<TStudentCustom> pageInfo1=new PageInfo<TStudentCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //  显示学生心肺耐力列表
    @RequestMapping("/studentCardiopulmonary1")
    @ResponseBody
    public CommonResult StudentCardiopulmonary(@RequestBody PageInfo pageInfo)throws Exception{
        Page page=PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<TCardiopulmonaryCustom> cardiopulmonaryCustomList=tCardiopulmonaryService.ListCardiopulmonary();
        PageInfo<TCardiopulmonaryCustom> pageInfo1=new PageInfo<TCardiopulmonaryCustom>(page.getResult());
        return CommonResult.success(pageInfo1);
    }

    //跳转修改老师信息页面
    @GetMapping("/edit/{id}")
    @ResponseBody
    public String EditTeacher(Authentication authentication, Model model, @PathVariable("id")String teacherId){

        TTeacher tTeacher=tTeacherService.selectTeacherbyId(teacherId);
        model.addAttribute("teacherinfo",tTeacher);
        return "";
    }

    ///////////////////以下为新旧前端通用代码/////////////////////////////

    //查询学生帐号是否重复
    /*@GetMapping("/checkstudentNo1/{studentNo}")
    @ResponseBody
    public String checkStudentNo(@PathVariable("studentNo") String studentNo)throws Exception{
        System.out.println(studentNo);
        List<TStudent> tStudent=studentService.selectByNameStudentNo(studentNo);
        if(tStudent==null){
            return "0";
        }else {
            return "1";
        }
    }*/

    //查询学生帐号是否重复
    @GetMapping("/checkstudentNo1/{studentNo}")
    @ResponseBody
    public CommonResult checkStudentNo(@PathVariable("studentNo") String studentNo)throws Exception{
        System.out.println(studentNo);
        List<TStudent> studentList=studentService.selectByStudentNo(studentNo);
        if(studentList.size()==0){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    /*//根据姓名或学号模糊查询学生信息
    @RequestMapping("/selectByNameStudentNo1")
    @ResponseBody
    public CommonResult SelectByNameStudentNo(@RequestBody Map<String, String> requestMap ) throws Exception{
        String NameStudentNo=requestMap.get("NameStudentNo");
        List<TStudent> studentList=studentService.selectByNameStudentNo(NameStudentNo);
        return CommonResult.success(studentList);
    }*/

    //根据姓名或学号模糊查询学生信息
    @RequestMapping("/selectByNameStudentNo1")
    @ResponseBody
    public CommonResult SelectByNameStudentNo(@RequestBody Map<String, String> requestMap) throws Exception{
        Map<String,String> map= JSONObject.fromObject(requestMap);
        String pagenum=map.get("pageNum");
        String pagesize=map.get("pageSize");
        int pageNum = Integer.parseInt(pagenum);
        int pageSize=Integer.parseInt(pagesize);
        Page page=PageHelper.startPage(pageNum,pageSize);
        String NameStudentNo=requestMap.get("NameStudentNo");
        List<TStudent> studentList=studentService.selectByNameStudentNo(NameStudentNo);
        PageInfo<TStudent> pageInfo1=new PageInfo<TStudent>(page.getResult());
        return CommonResult.success(pageInfo1);
    }


    //返回班级列表
    @RequestMapping(value = "getClassList1")
    @ResponseBody
    public List<TClass> getClass(@RequestBody String data){
        Map<String,String> map= JSONObject.fromObject(data);
        String gradeid=map.get("data");
        List<TClass> tClasses=grandClassService.selectClass(gradeid);
        return tClasses;
    }

    //查询所有老师信息
    @RequestMapping("/selectAllTeacher1")
    @ResponseBody
    public CommonResult SelectAllTeacher(){
        List<TTeacher> tTeacher=tTeacherService.selectAllTeacher();
        return CommonResult.success(tTeacher);
    }

}
