package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.mybatis.po.Msg;
import springboot.mybatis.po.TEyesight;
import springboot.service.TEyesightService;

@Controller
@RequestMapping("/tph/service")
public class TEyesightController {
    @Autowired
    private TEyesightService tEyesightService;

    //插入视力检测数据
    @PostMapping("/eyesight/uploadtest")
    @ResponseBody
    public Msg insertEyesightTest(@RequestBody TEyesight tEyesight){
        Integer status=tEyesightService.insertEyssightTest(tEyesight);
        if (status==1){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }
}
