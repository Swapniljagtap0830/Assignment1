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
public class Assignment33 {
   public static void main(String[] args) {
      int my_input, my_sum;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      System.out.println("The number is defined as " +my_input);
      my_sum = Add(my_input);
      System.out.println("The sum of natural numbers up to " + my_input + " is " + my_sum);
   }
   public static int Add(int my_input) {
      if (my_input > 0)
         return my_input + Add(my_input - 1);
      else
         return my_input;
   }
}
