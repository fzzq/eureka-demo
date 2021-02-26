package com.fzq.EecelImport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.fzq.EecelImport.dao")
@SpringBootApplication
public class ExcelImportDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelImportDemoApplication.class, args);
    }

}
