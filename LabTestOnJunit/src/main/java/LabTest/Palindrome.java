//Author name: Renu Sharma

/*
 * 2.Write a program for to check a palindrome string.
Write test cases for 4 different parameters (use @parametrizedTest annotaion).


 */

package LabTest;

public class Palindrome
{
	public static boolean palindrome_check(String str)
	{
		String reverse="";
		//for loop for reversing the string
	for(int i=str.length()-1;i>=0;i--)
		{
		reverse=reverse+str.charAt(i);
		}
	//checking whether a string is palindrome or not
		if(str.equals(reverse))
			return true;
		else 
			return false;
	}
}

