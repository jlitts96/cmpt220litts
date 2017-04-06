//File ConvoTwoVectors.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: April 6, 2017

//This file performs convolution between two data sets.



import java.util.Scanner;

public class ConvoTwoVectors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sfa = input.nextInt();
    int ssa = input.nextInt();
	
    double[] one = new double [sfa];
    double[] two = new double [sfa];
	
    for (int i = 0; i < sfa; i++)
      one[i] = input.nextDouble();
	  
    for (int i = 0; i < ssa; i++)
      two[i] = input.nextDouble();
	
    double[] p = convolveVectors(one, two);
	
    for (int i = 0; i < p.length; i++) 
      System.out.print(Math.round(p[i]) + " ");
	   
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    for (int idx = 0; idx < vResult.length; idx++) {
      for (int shift = 0; shift < vSecond.length; shift++){
        if (((idx - shift) >= 0) && ((idx- shift) < vFirst.length)) {
          vResult[idx] += vFirst[idx - shift] * vSecond[shift];
        }	  
      }
    }
	
    return vResult;  
  }
}