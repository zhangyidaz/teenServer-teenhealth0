package springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import springboot.mybatis.po.TCardiopulPlan;
import springboot.mybatis.po.TSomaticGamePlan;
import springboot.service.TCardiopulmonaryService;
import springboot.service.TSomaticGameService;

import java.util.Date;
import java.util.List;

//定时更新所有学生处方状态
@Configuration
@EnableScheduling
public class UpdateStudentPlans {
    @Autowired
    private TSomaticGameService tSomaticGameService;
    @Autowired
    private TCardiopulmonaryService tCardiopulmonaryService;
    //每周一的00:00更新处方库状态
    @Scheduled(cron = "0 0 0 * * 1")    //Seconds Minutes Hours DayofMonth Month DayofWeek Year
    public void cron(){
        Date date=new Date();
        long time1=date.getTime();
        //更新体感游戏处方库状态
        List<TSomaticGamePlan>tSomaticGamePlan=tSomaticGameService.ListStudentId();
        for(int j=0;j<tSomaticGamePlan.size();j++){
            long time0=tSomaticGamePlan.get(j).getCreateTime().getTime();
            long weeks=((time1-time0)/(24*60*60*1000)+1)/7;
            if(weeks>tSomaticGamePlan.get(j).getExecycle()){
                tSomaticGamePlan.get(j).setIsEnable(0);
                tSomaticGameService.UpdateStudentSomaticPlan(tSomaticGamePlan.get(j));
            }
        }

        //更新功率车处方库状态
        List<TCardiopulPlan>tCardiopulPlans=tCardiopulmonaryService.ListStudentPlan();
        for(int i=0;i<tCardiopulPlans.size();i++){
            long time2=tCardiopulPlans.get(i).getCreateTime().getTime();
            long weeks=((time1-time2)/(24*60*60*1000)+1)/7;
            if(weeks>tCardiopulPlans.get(i).getExecycle()){
                tCardiopulPlans.get(i).setIsEnable(0);
                tCardiopulmonaryService.UpdateTCardiopulPlan(tCardiopulPlans.get(i));
            }
        }
    }
}
