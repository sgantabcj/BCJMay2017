package com.nivtek.training.spring.injection.viasetter;

public class OutputHelper
{
    private IOutputGenerator outputGenerator;
 
    /* JVM will create default ctor if not provided 
     * Not required to provide the default ctor
    */
    
    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public IOutputGenerator getOutputGenerator() {
      return outputGenerator;
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
      System.out.println("In setter");
      this.outputGenerator = outputGenerator;
    }
}
