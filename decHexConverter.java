// Luis Rios
// 3/14/2016
// Decimal Hexadecimal Conversion

import java.util.Scanner;
import java.util.InputMismatchException;

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
    Scanner scanner = new Scanner(System.in);
    int finishProgram = 0;
    int userIntValue; 
    do {
      
      System.out.println("Enter an integer value from 0-255: ");
      try{
        userIntValue = scanner.nextInt();
        // If value is out of bounds, say so and start again
        if (userIntValue > 255 || userIntValue < 0){
          System.out.println("This integer is out of range.");
        }
        else {
          String hexValue = decHexConverter(userIntValue);
          System.out.println("The hexadecimal value for " + userIntValue + " is " + hexValue + ".");
          
        }
        
        System.out.println("Convert a new value? Input 0 to continue  ");
        int userContinue = scanner.nextInt();
        if(userContinue == 0) {
          finishProgram = 0;
        }
        else {
          System.exit(0);
        }
      }
      catch(InputMismatchException e) {
          System.out.println("You entered bad data... Try again.");
          scanner.next();
      }
    } while (finishProgram == 0);
  }

}
