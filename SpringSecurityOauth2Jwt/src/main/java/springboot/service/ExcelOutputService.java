package springboot.service;

import springboot.mybatis.po.ExcelOutput;

public interface ExcelOutputService {
    ExcelOutput output(String id);
}
