package springboot.Controller.terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.po.*;
import springboot.service.StudentService;
import springboot.service.TPhysicalFitnessService;
import springboot.service.TTeacherService;

@RestController
@RequestMapping("/tph/service")
public class TPhysicalFitnessController {
    @Autowired
    private TPhysicalFitnessService tPhysicalFitnessService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/physicalfitness/uploadtest")
    @ResponseBody
    public CommonResult insertTest(@RequestBody TPhysicalFitnessCustom tPhysicalFitnessCustom)throws Exception{
        if(tPhysicalFitnessCustom.getStudentId()==null){
            return CommonResult.fail();
        }else {
            TPhysicalFitness tPhysicalFitness=new TPhysicalFitness();
            TStudent tStudent=new TStudent();

            tPhysicalFitness.setFwcData(tPhysicalFitnessCustom.getFwcData());
            tPhysicalFitness.setYwqzData(tPhysicalFitnessCustom.getYwqzData());
            tPhysicalFitness.setZwtqqData(tPhysicalFitnessCustom.getZwtqqData());
            tPhysicalFitness.setUploadTime(tPhysicalFitnessCustom.getUploadTime());
            tStudent.setId(tPhysicalFitnessCustom.getStudentId());
            tStudent.setStature(tPhysicalFitnessCustom.getStature());
            tStudent.setWeight(tPhysicalFitnessCustom.getWeight());

            Integer a=tPhysicalFitnessService.insertTest(tPhysicalFitness);
            Integer b=studentService.updateStudent(tStudent.getId(),tStudent);
            if(a==1 && b==1){
                return CommonResult.success();
            }else {
                return CommonResult.fail();
            }
        }
    }

}
