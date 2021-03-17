package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.CommonResult;
import springboot.mybatis.po.Msg;
import springboot.mybatis.po.TStudent;
import springboot.mybatis.po.TTeacher;
import springboot.service.StudentService;
import springboot.service.TTeacherService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tph/service")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TTeacherService tTeacherService;

    //终端设备学生学号登录
    @RequestMapping(value = {"/student/student_login"},produces="application/json;charset=UTF-8")
    public Msg studentLogin(@RequestBody Map<String, String> requestMap)throws Exception{
        String studentNo=requestMap.get("studentNo");
        List<TStudent> tStudent=studentService.selectByStudentNo(studentNo);
        if(tStudent!=null){
            return Msg.success(tStudent);
        }else {
            return Msg.fail();
        }
    }

    @GetMapping("/teacherlogin/{teacherId}")
    public CommonResult teacherLogin(TTeacher tTeacher, @PathVariable("teacherId")String userId){
        tTeacher=tTeacherService.selectTeacherbyuserId(userId);
        if(tTeacher==null){
            return CommonResult.fail();
        }else {
            return CommonResult.success(tTeacher);
        }
    }

}
