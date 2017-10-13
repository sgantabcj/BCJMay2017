package com.nivtek.training.spring.injection.viactor;

public class OutputHelper
{
    private IOutputGenerator outputGenerator;
 
    public OutputHelper(IOutputGenerator outputGenerator){
      // Before using Spring, you hard coded what kind of outputGenerator to use
      // This introduced a tight (strong) coupling between this class & the concrete class of OutputGenerator
      // Your objective is to have loose (weak) coupling.
      // outputGenerator = new CsvOutputGenerator();
        this.outputGenerator = outputGenerator;
    }
 
    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public IOutputGenerator getOutputGenerator() {
      return outputGenerator;
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
      this.outputGenerator = outputGenerator;
    }
 
}
