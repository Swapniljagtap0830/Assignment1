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
public class Assignment35 {
   public static void main(String[] args) {
      int my_input_1, my_input_2, my_result;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the first number : ");
      my_input_1 = my_scanner.nextInt();
      System.out.print("Enter the second number : ");
      my_input_2 = my_scanner.nextInt();
      my_result = CommonFactor(my_input_1, my_input_2);
      System.out.printf("The G.C.D of %d and %d is %d.", my_input_1, my_input_2, my_result);
   }
   public static int CommonFactor(int my_input_1, int my_input_2){
      if (my_input_2 != 0)
         return CommonFactor(my_input_2, my_input_1 % my_input_2);
      else
         return my_input_1;
   }
}
