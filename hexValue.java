// Luis Rios
// 3/14/2016
// hexValue constructor class for Decimal Hexadecimal Conversion

import java.io.*;
import java.util.Scanner;

public class hexValue{

  public int mDecValueToConvert;
  public String mHexConvertedValue;

  public hexValue(int decimalValue) {
    mDecValueToConvert = decimalValue;
  }

  public int getDecToConvert(){
    return mDecValueToConvert;
  }
  public void setDecToConvert(int decToConvert){
    mDecValueToConvert = decToConvert;
  }

  public String getHexConvertedValue(){
    return mHexConvertedValue;
  }

  public void setHexConvertedValue(String hexConvertedValue){
    mHexConvertedValue = hexConvertedValue;
  }

  public String setHexConvertedValue(int decToConvert){
    int tensPlaceNumber = decToConvert / 16;
    int onesPlaceNumber = decToConvert % 16;

    // Convert number value to letter value if > 10
    String tensString = convertLetterValue(tensPlaceNumber);
    String onesString = convertLetterValue(onesPlaceNumber);

    String hexString = tensString + onesString;
    return hexString;
  }

  public String convertLetterValue(int value){
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

}
