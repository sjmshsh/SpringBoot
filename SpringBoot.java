package com.example.springboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements InitializingBean {
    @Value("${cctalk.tocket}") //读取配置文件
    private String cctalkToken;

    /*
    * 参数设置完成之后，执行此方法
    * */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println();
        System.out.println("afterPropertiesSet");
        System.out.println("cctalkToken" + cctalkToken);
        System.out.println();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
