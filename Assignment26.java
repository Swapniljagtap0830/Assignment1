/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Swapnil
 */
public class Assignment26 {
  public static void main(String[] args) {

    int low = 999, high = 99999;

    for(int number = low + 1; number < high; ++number) {
      int digits = 0;
      int result = 0;
      int originalNumber = number;

      // number of digits calculation
      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;

      // result contains sum of nth power of its digits
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number) {
        System.out.print(number + " ");
      }
    }
  }
}

