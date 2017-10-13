package com.nivtek.training.ifstatement;

public class DemoIfElse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: LetterGrade <numeric-score>");
            return;
        }
        
        for (int i = 0; i < args.length; i++) {
          int score = Integer.parseInt(args[i]);
          char grade;
          if (score >= 90) {
            grade = 'A';
          } else if (score >= 80) {
            grade = 'B';
          } else if (score >= 70) {
            grade = 'C';
          } else if (score >= 60) {
            grade = 'D';
          } else {
            grade = 'F';
          }
          System.out.println("Grade of student " + (i+1) + " with a score of " + args[i] + " = " + grade);
        }
    }
}