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
import java.util.*;
public class Assignment49 {
	static void swapValuesUsingThirdVariable(int m, int n)
	{
		// Swapping the values
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}

	// Main driver code
	public static void main(String[] args)
	{
		// Random integer values
		int m = 9, n = 5;

		// Calling above function to
		// reverse the numbers
		swapValuesUsingThirdVariable(m, n);
	}
}

