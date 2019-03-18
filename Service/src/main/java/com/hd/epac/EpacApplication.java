package com.hd.epac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @Description:  
* @Param:  
* @return:  
* @Author: Mr.Shi
* @Date: 2019/3/18
*/ 
@SpringBootApplication
@MapperScan("com.hd.epac.dao")
public class EpacApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpacApplication.class, args);
    }

}
