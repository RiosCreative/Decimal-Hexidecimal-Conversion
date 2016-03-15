// Luis Rios
// 3/14/2016
// Decimal Hexidecimal Conversion

import java.io.*;
import java.util.Scanner;

/* For numbers less than 256, each will have a 2 digit hex value from 00 to FF.
 * Therefore, we can convert the decimal to a hex value by dividing it by 16 to 
 * get the first digit and taking the remainder to get the second. 
 */
public class decHexConverter {

  public static String decHexConverter(int decimalValue){
    String hexValue = convertValue(decimalValue);
    return hexValue;
  }
  
  private static String convertValue(int value) {
    int tensPlaceNumber = value / 16;
    int onesPlaceNumber = value % 16;

    // Convert number value to letter value if > 10
    String tensString = numLetterConversion(tensPlaceNumber);
    String onesString = numLetterConversion(onesPlaceNumber);
    
    String hexString = tensString + onesString;
    return hexString;
  }

/* Convert tens and ones place values to letters as necessary. 
 */
  private static String numLetterConversion(int value) {
    String letterValue = new String();
    if (value < 10) {
      return Integer.toString(value);
    }
    else if (value == 10) {
      letterValue = "A";
    }
    else if (value == 11) {
      letterValue = "B";
    }
    else if (value == 12) {
      letterValue = "C";
    }
    else if (value == 13) {
      letterValue = "D";
    }
    else if (value == 14) {
      letterValue = "E";
    }
    else if (value == 15) {
      letterValue = "F";
    }
    
    return letterValue;
  }
  
  public static void main(String[] args){
    /* Scanner to take user input*/
    Scanner input = new Scanner(System.in);  
    
    int finishProgram = 0;
    while (finishProgram == 0) {
      /*Prompt user to give an integer from 0-255 */
      System.out.println("Enter an integer from 0 to 255 to convert to hexidecimal: ");
      int userValue = input.nextInt();
      
      String hexValue = decHexConverter(userValue);
      
      System.out.println("The hexidecimal value for " + userValue + " is "+ hexValue + ".");
      
      System.out.println("/n Convert a new value? Input 0 to continue");
      int userContinue = input.nextInt();
      
      if(userContinue == 0) {
        finishProgram = 0;
      }
      else {
        System.exit(0);
      }
      
    }
  }
  
}