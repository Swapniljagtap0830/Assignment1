/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Assignment4 {
    public static void main(String[] args){
         int x,y,t;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of X and Y");
         x = sc.nextInt();
         y = sc.nextInt();
         System.out.println("before swapping numbers:"+x+""+y);
         t = x;
         x = y;
         y = t;
         System.out.println("After swapping:"+x+""+y);
         System.out.println();
    }   
}