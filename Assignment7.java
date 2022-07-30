/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author lenovo
 */
public class Assignment7 {
    public static void main(String[] args){
        double n1=10, n2=20, n3=15;
        if(n1>=n2&&n1>n3)
            System.out.println(n2+"is largest number");
        else if(n2>=n1&&n2>=n3)
            System.out.println(n2+"is largest number");
        else
            System.out.println(n3+"is largest number");
    }
}
