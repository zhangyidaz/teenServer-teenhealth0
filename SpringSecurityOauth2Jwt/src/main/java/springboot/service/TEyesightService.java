package springboot.service;

import springboot.mybatis.po.TEyesight;

import java.util.List;

public interface TEyesightService {
    public int insertEyssightTest(TEyesight tEyesight);

    public List<TEyesight> ListEyesight();
}
