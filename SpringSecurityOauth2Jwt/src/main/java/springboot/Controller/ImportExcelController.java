package springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import springboot.mybatis.po.Msg;
import springboot.mybatis.po.TStudent;

@Controller
@RequestMapping("/teacher")
public class ImportExcelController {

    @PostMapping("/uploadExcel")
    public Msg ImportExcel(MultipartFile file, TStudent tStudent){
        return Msg.success();
    }
}
