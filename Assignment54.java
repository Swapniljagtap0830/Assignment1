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
public class Assignment54 {
    public static void main(String args[]) {
        String firstname = "Virat";
        String lastname = "Kohli";
        String name = firstname + " " + lastname; 
        System.out.println(name);
        StringBuilder sb = new StringBuilder(14);
        sb.append(firstname).append(" ").append(lastname);
        System.out.println(sb.toString());
        StringBuffer sBuffer = new StringBuffer(15);
        sBuffer.append(firstname).append(" ").append(lastname);
        System.out.println(sBuffer.toString());
    }
}
