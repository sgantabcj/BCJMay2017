package com.nivtek.training.spring.injection.viactor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CtorInjectionDemo {

  /*  Before using Spring
  public static void main(String[] args) {
    OutputHelper outputHelper = new OutputHelper();
    outputHelper.generateOutput();
  }
   */
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "DIViaCtor-SpringContext.xml" });
    
    OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
    
    // Now internally, this is what Spring would have done
    /*
    
    OutputGenerator excelOutputGenerator = new ExcelOutputGenerator();
    OutputHelper outputHelper = new OutputHelper(excelOutputGenerator);
    */
    outputHelper.generateOutput();

  }
}
