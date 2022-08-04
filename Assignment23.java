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
import java.util.Scanner;
public class Assignment23 {
   public static void main(String[] args) {
      int my_input;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      boolean isprime = false;
      for (int i = 2; i <= my_input / 2; ++i) {
         if (my_input % i == 0) {
            isprime = true;
            break;
         }
      }
      if (!isprime)
         System.out.println("The number " +my_input + " is a prime number.");
      else
         System.out.println("The number " +my_input + " is not a prime number.");
   }
}   

