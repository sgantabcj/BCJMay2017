package com.nivtek.training.assignment;

import java.text.DecimalFormat;

public class AverageScore {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int numberOfScores = args.length;
    System.out.println("Number of scores: " + numberOfScores);
    float sumOfScores = 0;
    for (int i = 0; i < args.length; i++) {
      int eachScore = Integer.parseInt(args[i]);
      sumOfScores = sumOfScores + eachScore;
    }
    System.out.println("Sum of scores: " + sumOfScores);

    float averageOfScores = 0;
    if (numberOfScores > 0) {
      averageOfScores = sumOfScores / numberOfScores;
    }

    DecimalFormat dec = new DecimalFormat("###.##");
    System.out.println("Average of scores: " + dec.format(averageOfScores));
    System.out.println();
    
    System.out.println("Computing average score using a while loop");
    System.out.println();
    useWhileLoopToComputeAverageScore(args);
  }

  public static void useWhileLoopToComputeAverageScore(String[] args) {
    int i = 0;
    int numberOfScores = args.length;
    System.out.println("Number of scores: " + numberOfScores);
    float sumOfScores = 0;
    while (i < args.length)
    {
      int eachScore = Integer.parseInt(args[i]);
      sumOfScores = sumOfScores + eachScore;
      i++;
    }
    System.out.println("Sum of scores: " + sumOfScores);
    float averageOfScores = 0;
    if (numberOfScores > 0) {
      averageOfScores = sumOfScores / numberOfScores;
    }

    DecimalFormat dec = new DecimalFormat("###.##");
    System.out.println("Average of scores: " + dec.format(averageOfScores));
  }

}
