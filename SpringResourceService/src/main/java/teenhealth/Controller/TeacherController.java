package teenhealth.Controller;

import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import teenhealth.mybatis.po.*;
import teenhealth.service.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
@PreAuthorize("hasAuthority('ROLE_USER')")
public class TeacherController {
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
    @RequestMapping(value = "/homepage")
    public String HomepageList(Model model,TClass tClass)throws Exception{
        List<TStudent> studentList=studentService.listStudent();
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
        return "homePage";
    }

    //  显示学生列表
    @RequestMapping("/studentList")
    public String StudentInfoList(Principal principal, Model model)throws Exception{
        System.out.println(principal.getName());
        List<TStudent> studentList=studentService.listStudent();
        model.addAttribute("studentList",studentList);
        return "studentList";
    }

    //  显示学生心肺耐力列表
    @RequestMapping("/studentCardiopulmonary")
    public String StudentCardiopulmonary(Model model)throws Exception{
        List<TCardiopulmonaryCustom> cardiopulmonaryCustomList=tCardiopulmonaryService.ListCardiopulmonary();
        model.addAttribute("studentCardio",cardiopulmonaryCustomList);
        return "studentCardiopulmonary";
    }

    //模糊查询学生信息
    @RequestMapping("/selectByNameStudentNo")
    @ResponseBody
    public TStudent SelectByNameStudentNo(String NameStudentNo) throws Exception{
        TStudent tStudent=studentService.selectByNameStudentNo(NameStudentNo);
        return tStudent;
    }

    //返回班级列表
    @RequestMapping(value = "getClassList")
    @ResponseBody
    public List<TClass> getClass(@RequestBody String data){
        Map<String,String> map= JSONObject.fromObject(data);
        String gradeid=map.get("data");
        List<TClass> tClasses=grandClassService.selectClass(gradeid);
        return tClasses;
    }

    //跳转添加学生页面
    @GetMapping("/addstudent")
    public String toAddStudent(Model model){
        Collection<TGrade> tGradeds=grandClassService.selectGrade();
        model.addAttribute("grades",tGradeds);
        return "add_student";
    }

    //查询学生帐号是否重复
    @GetMapping("/checkstudentNo/{studentNo}")
    @ResponseBody
    public String checkStudentNo(@PathVariable("studentNo") String studentNo)throws Exception{
        System.out.println(studentNo);
        TStudent tStudent=studentService.selectByNameStudentNo(studentNo);
        if(tStudent==null){
            return "0";
        }else {
            return "1";
        }
    }

    //保存学生信息
    @PostMapping("/addstudent")
    public String addStudent(TStudent tStudent)throws Exception{
        studentService.insertStudent(tStudent);
        return "redirect:/teacher/studentList"; //重定向到学生信息页面
    }

    //跳转编辑学生信息页面
    @GetMapping("/editstudent/{id}")
    public String editStudent(Model model,@PathVariable("id")String id){
        TStudentCustom tStudentCustom=studentService.selectBystudentId(id);
        model.addAttribute("student",tStudentCustom);
        return "edit_student";
    }

    //修改学生信息
    @PostMapping("/editstudent/{id}")
    public String editStudent(TStudent tStudent,@PathVariable("id")String id)throws Exception{
        studentService.updateStudent(id, tStudent);
        return "redirect:/teacher/studentList";
    }

    //删除学生信息
    @GetMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable("id") String id)throws Exception{
        studentService.deleteStudent(id);
        TStudent tStudent = studentService.selectBystudentId(id);
        if (tStudent ==null){
            return "redirect:/teacher/studentList";
        }else {
            return "300";
        }
    }

    //班级管理
    @RequestMapping("/classList")
    public String ClassList(Model model){
        List<TClassCustom> tClassCustom=grandClassService.listClasses();
        model.addAttribute("classlist",tClassCustom);
        return "classList";
    }

    //跳转添加班级页面
    @GetMapping("/addclass")
    public String AddClass(Model model){
        Collection<TGrade> tGradeds=grandClassService.selectGrade();
        model.addAttribute("grades",tGradeds);
        Collection<TTeacher> tTeachers=tTeacherService.selectteachers();
        model.addAttribute("teacher",tTeachers);
        return "add_class";
    }

    //添加班级页面
    @PostMapping("/addclass")
    public String AddClass(TClass tClass){
        grandClassService.insertClass(tClass);
        return "redirect:/teacher/classList";
    }

    //编辑班级信息页面
    @GetMapping("/editclass/{classId}")
    public String EditClass(Model model,@PathVariable("classId")String classId){
        TClassCustom tClassCustom=classService.selectClassGradeInfo(classId);
        model.addAttribute("class",tClassCustom);
        Collection<TTeacher> tTeachers=tTeacherService.selectteachers();
        model.addAttribute("teacher",tTeachers);
        return "edit_class";
    }

    //保存班级信息
    @PostMapping("/editclass/{id}")
    public String SaveEditClass(TClass tClass,@PathVariable("id")String id){
        tClass.setId(id);
        classService.updateClassInfo(tClass);
        return "redirect:/teacher/classList";
    }

    //班级信息页面
    @GetMapping("/classinfo/{classId}")
    public String ClassInfo(Model model,@PathVariable("classId")String classId ){
        Collection<TStudent> tStudents=studentService.listStudentbyClass(classId);
        model.addAttribute("studentList",tStudents);
        return "class_student";
    }

    //根据年级id查询班级
    @GetMapping("/classlist/{gradeid}")
    public String GradeClass(Model model,@PathVariable("gradeid")String gradeid){
        Collection<TClassCustom> tClassCustoms=classService.selectClassbyGradeid(gradeid);
        model.addAttribute("classinfo",tClassCustoms);
        return "classListX";
    }

    //删除班级
    @GetMapping("/deleteclass/{id}")
    public String DeleteClass(@PathVariable("id")String classId){
        TClass tClass=classService.selectClassInfo(classId);
        if(tClass.getStudentsNumber()==0){
            classService.deleteClass(classId);
            return "redirect:/teacher/classList";
        }else {
            return "redirect:/teacher/classList";
        }
    }
}
