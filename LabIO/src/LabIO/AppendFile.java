//Author name : Renu Sharma

/* 
  AppendFile.java
  
2.Write a Java program to append text to an existing file.


 */

package LabIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFile {

	public static void main(String[] args)
	{
		appendMethod();
		
	}
	
	
	public static void appendMethod()
	{
		File f=new File("B:\\Labtest");
		try {
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.append("  Renu Sharma  ");
			
			System.out.println("Successfully add Data in file.......\n");
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			int i=br.read();
            //read the file content
            while (i!= -1)
            {
            	System.out.print((char)i);
				i=br.read();
               }
            br.close();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}

}
