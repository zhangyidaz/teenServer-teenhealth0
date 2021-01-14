package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.mybatis.po.Msg;
import springboot.mybatis.po.TStudent;
import springboot.service.StudentService;

import java.util.Map;

@RestController
@RequestMapping("/tph/service/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //终端设备学生学号登录
    @RequestMapping(value = {"/student_login"},produces="application/json;charset=UTF-8")
    public Msg studentLogin(@RequestBody Map<String, String> requestMap)throws Exception{
        String studentNo=requestMap.get("studentNo");
        TStudent tStudent=studentService.selectByNameStudentNo(studentNo);
        if(tStudent!=null){
            return Msg.success(tStudent);
        }else {
            return Msg.fail();
        }
    }

}
