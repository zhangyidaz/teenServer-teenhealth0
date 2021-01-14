package springboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mybatis.mapper.TEyesightMapper;
import springboot.mybatis.po.TEyesight;
import springboot.service.TEyesightService;

import java.util.List;

@Service
public class TEyesightServiceImpl implements TEyesightService {
@Autowired
private TEyesightMapper tEyesightMapper;
    //插入视力测试数据
    @Override
    public int insertEyssightTest(TEyesight tEyesight){
        return tEyesightMapper.insertSelective(tEyesight);
    }

    //在页面显示所有学生视力信息
    @Override
    public List<TEyesight> ListEyesight(){
        return tEyesightMapper.ListEyesight();
    }

}
