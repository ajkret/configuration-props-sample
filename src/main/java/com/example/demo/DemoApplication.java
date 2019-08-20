package com.example.demo;

import com.example.demo.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {

    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    SimpleBean bean = context.getBean(SimpleBean.class);
    bean.listProperties();




  }

}
