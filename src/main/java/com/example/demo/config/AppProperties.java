package com.example.demo.config;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application.config", ignoreUnknownFields = true)
public class AppProperties {

  private List<String> exampleList;
  private Map<String, String> exampleMap;
  private Map<String, Complex> complexType;
  private List<Complex> complexList;

  public List<String> getExampleList() {
    return exampleList;
  }

  public void setExampleList(List<String> exampleList) {
    this.exampleList = exampleList;
  }

  public Map<String, String> getExampleMap() {
    return exampleMap;
  }

  public void setExampleMap(Map<String, String> exampleMap) {
    this.exampleMap = exampleMap;
  }

  public Map<String, Complex> getComplexType() {
    return complexType;
  }

  public void setComplexType(Map<String, Complex> complexType) {
    this.complexType = complexType;
  }

  public List<Complex> getComplexList() {
    return complexList;
  }

  public void setComplexList(List<Complex> complexList) {
    this.complexList = complexList;
  }

  public static class Complex {

    private int id;
    private String value;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }
  }
}
