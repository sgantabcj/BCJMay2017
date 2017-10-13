package com.nivtek.training.log4java;

// Import log4j classes.
import org.apache.log4j.Logger;

import com.nivtek.training.log4java.bar.MyBar;

public class Log4jDemo {

  // Logging levels - DEBUG < INFO < WARN < ERROR < FATAL
  
  // Define a static logger variable so that it references the
  // Logger instance named "Log4jDemo".
  static Logger log = Logger.getLogger(Log4jDemo.class);

  public static void main(String[] args) {

    // Set up a simple configuration that logs on the console.
    // BasicConfigurator.configure();

    // Always use debug with the debug enabled check
    if (log.isDebugEnabled()) {
      log.debug("Entering application.");
    }
    MyBar testBar = new MyBar();
    testBar.doIt();
    log.info("Exiting application.");
  }
}
