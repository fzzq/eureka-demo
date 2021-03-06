package com.fzq.EecelImport.controller;

import com.fzq.EecelImport.entity.SimilarTest;
import com.fzq.EecelImport.entity.TbmCodeClass;
import com.fzq.EecelImport.service.TbmCodeClassService;
import com.fzq.EecelImport.service.TestService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private TbmCodeClassService tbmCodeClassService;

    @ResponseBody
    @RequestMapping("/test")
    public String getHellow() {
        List<SimilarTest> all = testService.findAll();

        return all.toString();

    }


    @ResponseBody
    @RequestMapping("/import")
    public String importExcel() {
        String filePath = "C:\\Users\\Administrator\\Desktop\\掘进机参数编码final.xlsx";
        List<Map<String, String>> maps = readExcel2(filePath);
        System.out.println(maps);
        ArrayList<TbmCodeClass> codeClasses = new ArrayList<>();
        int successNum= 0 ;
        for (Map<String, String> map : maps) {
            TbmCodeClass tbmCodeClass = new TbmCodeClass();
            tbmCodeClass.setName(map.get("name"));
            tbmCodeClass.setCode(map.get("code"));
            tbmCodeClass.setTtm1(boolenFlagConvert(map.get("ttm1")));
            tbmCodeClass.setTtm2(boolenFlagConvert(map.get("ttm2")));
            tbmCodeClass.setTtm3(boolenFlagConvert(map.get("ttm3")));
            tbmCodeClass.setTtm4(boolenFlagConvert(map.get("ttm4")));
            tbmCodeClass.setTtm5(boolenFlagConvert(map.get("ttm5")));
            tbmCodeClass.setRemark(map.get("remark"));
            successNum+= tbmCodeClassService.save(tbmCodeClass);
            codeClasses.add(tbmCodeClass);
        }

        return codeClasses.toString();
    }

    public Integer boolenFlagConvert(String flag) {
        switch (flag) {
            case "是":
                return 1;
            case "否":
                return 0;
        }
        return null;
    }


    public List<Map<String, String>> readExcel2(String filePath) {
        Workbook wb = null;
        Sheet sheet = null;
        Row row = null;
        List<Map<String, String>> list = null;
        String cellData = null;

        String columns[] = {
                "name",
                "code",
                "ttm1",
                "ttm2",
                "ttm3",
                "ttm4",
                "ttm5"
        };
        wb = readExcel(filePath);
        if (wb != null) {
            //用来存放表中数据
            list = new ArrayList<Map<String, String>>();
            //获取第一个sheet
            sheet = wb.getSheetAt(0);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取第一行
            row = sheet.getRow(0);
            //获取最大列数
            int colnum = columns.length;
            for (int i = 1; i < rownum; i++) {
                Map<String, String> map = new LinkedHashMap<String, String>();
                row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < colnum; j++) {
                        cellData = (String) getCellFormatValue(row.getCell(j));
                        map.put(columns[j], cellData);
                    }
                } else {
                    break;
                }
                list.add(map);
            }
        }
        //遍历解析出来的list
        for (Map<String, String> map : list) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
            }
            System.out.println();
        }

        return list;
    }


    //读取excel
    public static Workbook readExcel(String filePath) {
        Workbook wb = null;
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            } else {
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            //判断cell类型
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC: {
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case Cell.CELL_TYPE_FORMULA: {
                    //判断cell是否为日期格式
                    if (DateUtil.isCellDateFormatted(cell)) {
                        //转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();
                    } else {
                        //数字
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }


}
