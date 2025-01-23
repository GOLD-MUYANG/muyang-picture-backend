package com.muyang.muyangpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.muyang.muyangpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MuyangPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuyangPictureBackendApplication.class, args);
    }

}

