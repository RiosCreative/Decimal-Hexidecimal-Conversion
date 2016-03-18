// Luis Rios
// 3/14/2016
// Demo for HeValue class for Decimal Hexadecimal Conversion

import java.io.*;
import java.util.Scanner;

public class hexValueDemo {
  
  public static void main(String [] args){
    int continueProgram = 1;
    Scanner scanner = new Scanner(System.in);
    while (continueProgram == 1){
      System.out.println("\nEnter an integer 0-255:");
      int input = scanner.nextInt();
      hexValue converter = new hexValue(input);
      String convertedValue = converter.setHexConvertedValue(input);
      System.out.println("The hex value of " + input + " is " + convertedValue);
      System.out.println("Enter 1 to continue");
      continueProgram = scanner.nextInt();
      if (continueProgram == 1){
        //continue the program
      } else {
      System.exit(0);
      }
    }
  }
}
