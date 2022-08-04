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
public class Assignment14{
   public static void main(String[] args){
      int input_1 , input_2 , gcd ;
      Scanner reader = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter a first number: ");
      input_1 = reader.nextInt();
      System.out.print("Enter a second number: ");
      input_2 = reader.nextInt();
      gcd = 1;
      for(int i = 1; i <= input_1 && i <= input_2; i++){
         if(input_1%i==0 && input_2%i==0)
         gcd = i;
      }
      System.out.printf("\nThe GCD of %d and %d is: %d", input_1, input_2, gcd);
   }
}