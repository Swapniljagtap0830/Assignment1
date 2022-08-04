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
public class Assignment22 {
    public static void main (String[] args)
    {
        //declare and initiate an integer variable n1 with some value
        int n1 = 121;
        //declace another integer variable n2 and call the user defined function
        //so that the reverse value will be stored in n2
        int n2 = reverseValue(n1, 0);
        //check the condition
        if (n2 == n1)
            System.out.println(n1+" is a palindrome number.");
        else
            System.out.println(n1+" is not a palindrome number." );
    }
        
    //Define the user defined method
    static int reverseValue(int n1, int n2)
    {
        if (n1 == 0)
            return n2;
        n2 = (n2 * 10) + (n1 % 10);
        //call  the method inside the same method
        return reverseValue(n1 / 10, n2);
    }
}  

