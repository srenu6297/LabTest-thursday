//Author name : Renu Sharma

/*
LongestWord.java
  
3.Write a Java program to find the longest word in a text file.

 */

package LabIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args)
	{
		LenthWord();
	}

	
	public static void LenthWord()
	{
		File f=new File("B:\\newfilehandling.txt");
		try {
			String str="";
			String ct;
			
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
				ct=sc.next();
				if(ct.length()>str.length())
				{
					str=ct;
				}
			}
			System.out.println(str);
		}
		catch (FileNotFoundException e) 
		{
				e.printStackTrace();
		}
	}
}
