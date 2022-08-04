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
public class Assignment52 {	
	public void removeNonAlphabets(String text)
	{
		// Get the length
		int n = text.length();
		if (n == 0)
		{
			return;
		}
		String result = "";
		int i = 0;
		while (i < n)
		{
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z' || 
                (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))
			{
				// When alphabets character
				result = result + text.charAt(i);
			}
			i++;
		}
		System.out.println(" Given text : " + text);
		System.out.println(" Result     : " + result);
	}
	public static void main(String[] args)
	{
		RemoveCharacters task = new RemoveCharacters();
		// Test
		task.removeNonAlphabets("!*&3M'?an/<go_,j#u$$ic^e(&)");
		task.removeNonAlphabets("5@23A23B.C");
	}
}