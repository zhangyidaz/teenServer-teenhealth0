package springboot.service;

import springboot.mybatis.po.TEyesight;
import springboot.mybatis.po.TEyesightCustom;

import java.util.List;

public interface TEyesightService {
    public int insertEyssightTest(TEyesight tEyesight);

    public List<TEyesightCustom> ListEyesight();
}
