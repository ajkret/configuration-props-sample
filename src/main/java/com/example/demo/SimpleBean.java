package com.example.demo;

import com.example.demo.config.AppProperties;
import com.example.demo.config.AppProperties.Complex;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {

  private static Logger log = LoggerFactory.getLogger(SimpleBean.class);

  @Autowired
  private AppProperties properties;

  public void listProperties() {

    log.info("List of properties [{}]",
        properties.getExampleList().stream().collect(Collectors.joining(",")));

    log.info("Map of properties [{}]",
        properties.getExampleMap().entrySet().stream().map(entry -> String.format("%s=%s", entry.getKey(), entry.getValue())).collect(Collectors.joining(",")));

    for(Map.Entry<String, Complex> entry : properties.getComplexType().entrySet()) {
      log.info("Complex {} id: {} value: {}", entry.getKey(), entry.getValue().getId(), entry.getValue().getValue());
    }

    for(Complex entry : properties.getComplexList()) {
      log.info("Complex id: {} value: {}", entry.getId(), entry.getValue());
    }

  }
}
