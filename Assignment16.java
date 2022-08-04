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
public class Assignment16{
   public static void main(String[] args){
      int my_input , reverse_input, my_remainder;
      reverse_input = 0;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      while(my_input != 0){
         my_remainder = my_input % 10;
         reverse_input = reverse_input * 10 + my_remainder;
         my_input = my_input/10;
      }
      System.out.println("The reverse value of the given input is: " + reverse_input);
   }
}