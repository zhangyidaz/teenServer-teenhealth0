package springboot.service.Impl;

import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mybatis.mapper.ExcelOutputMapper;
import springboot.mybatis.po.ExcelOutput;
import springboot.service.ExcelOutputService;

@Service
public class ExcelOutputServiceImpl implements ExcelOutputService {
    @Autowired
    private ExcelOutputMapper excelOutputMapper;

    @Override
    public ExcelOutput output(String id){
        return excelOutputMapper.selcetSyntheticDateBystudentNo(id);
    }

}
