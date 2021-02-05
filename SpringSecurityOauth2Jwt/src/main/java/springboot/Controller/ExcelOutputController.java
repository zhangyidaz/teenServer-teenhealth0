package springboot.Controller;

import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.mybatis.po.ExcelOutput;
import springboot.service.ExcelOutputService;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/teacher")
public class ExcelOutputController {
    @Autowired
    private ExcelOutputService excelOutputService;

    //设置输出Excel表格的单元格格式
    private static void createCell(Workbook wb, Row row, Object value , int column, HorizontalAlignment halign,
                                   VerticalAlignment valign) {
        Cell cell = row.createCell(column);
        String value1=String.valueOf(value);        //强转String类型
        cell.setCellValue(value1);
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setWrapText(true);
        cellStyle.setAlignment(halign);
        cellStyle.setVerticalAlignment(valign);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cell.setCellStyle(cellStyle);
    }

    @RequestMapping(value = "/output/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void StudentSyntheticDate(HttpServletResponse httpServletResponse, @PathVariable("id") String id,
                                     HorizontalAlignment halign, VerticalAlignment valign)throws IOException {
        System.out.println(id);
        ExcelOutput excelOutput=excelOutputService.output(id);
        //下载Excel表格
        try{
            //本地测试
            //Workbook wb=WorkbookFactory.create(new File("D:\\works\\teenhealth\\target\\teenhealth\\体测报告模版.xls"));
            //发布阿里云
            Workbook wb=WorkbookFactory.create(new File("/usr/java/jar/体测报告模版.xls"));
            Sheet sheet=wb.getSheet("Sheet1");
//            for (int i=0;i<headers.length;i++){
//                row.createCell(i).setCellValue(headers[i]);
//            }
            String studentName=excelOutput.tStudent.getStudentNo()+excelOutput.tStudent.getStudentName()+"体测报告.xls";
            for (int rowIndex=0;rowIndex<18;rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                if (rowIndex == 1) {
                    createCell(wb,row,excelOutput.tStudent.getStudentName(),1,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    String sex;
                    if (excelOutput.tStudent.getSex() == 1) {
                        sex = "男";
                    } else {
                        sex = "女";
                    }
                    createCell(wb,row,sex,3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,excelOutput.tStudent.getAge(),5,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,excelOutput.tStudent.getStature(),7,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 2) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tStudent.getLeftSight())),1,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tStudent.getRightSight())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,excelOutput.tStudent.getWeight(),5,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 5) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tCardiopulmonary.getOxygenUptake())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tCardiopulmonary.getHeartRate())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tCardiopulmonary.getSuggestion())),5,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 6) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tCardiopulmonary.getScore())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tCardiopulmonary.getFc())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 9) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getResultFlex())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getLevelFlex())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getSuggFlex())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 10) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getResultJump())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getLevelJump())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getSuggJump())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 11) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getResultChoosetime())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getLevelChoosetime())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getSuggChoosetime())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                } else if (rowIndex == 12) {
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getResultBlan())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getLevelBlan())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tSomaticGame.getSuggBlan())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                }else if (rowIndex == 15){
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getLeftNwz())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getRightNwz())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getTestadvice())),4,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getEatingadvice())),5,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getExecisingadvice())),7,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                }else if (rowIndex == 16){
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getLeftSxz())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getRightSxz())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                }else if (rowIndex==17){
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getLeftSxx())),2,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                    createCell(wb,row,DetermineNull(String.valueOf(excelOutput.tEyesight.getRightSxx())),3,HorizontalAlignment.JUSTIFY,VerticalAlignment.CENTER);
                }

            }
            httpServletResponse.setHeader("Content-Disposition","attachment;filename="+
                    new String(studentName.getBytes("utf-8"), "iso8859-1"));
            httpServletResponse.setContentType("application/binary;charset=UTF-8");
            OutputStream outputStream=httpServletResponse.getOutputStream();
            wb.write(outputStream);
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //体测项目为空检测
    public String DetermineNull(String parameter ){
        if (parameter==null){
            parameter="无";
            return parameter;
        }else {
            return parameter;
        }
    }
}
