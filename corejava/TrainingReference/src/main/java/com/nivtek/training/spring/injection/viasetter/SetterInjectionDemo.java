package com.nivtek.training.spring.injection.viasetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

  /*  Before using Spring
  public static void main(String[] args) {
    OutputHelper outputHelper = new OutputHelper();
    outputHelper.generateOutput();
  }
   */
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "DIViaSetter-SpringContext.xml" });
    
    OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
    
    // Now internally, this is what Spring would have done
    /*
    OutputHelper outputHelper = new OutputHelper();
    OutputGenerator excelOutputGenerator = new ExcelOutputGenerator();
    outputHelper.setOutputGenerator(excelOutputGenerator);
    */
    outputHelper.generateOutput();

  }
}
