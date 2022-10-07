//Author name: Renu Sharma

package TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import LabTest.Add_Multiply;
import LabTest.Arraylist_main;

public class ArrayTest 
{

	@Test
	public void emptyList()
	{
		assertEquals(false,Arraylist_main.main().isEmpty());
	}
	
	@Test
	public void sizeofList()
	{
		assertEquals(6,Arraylist_main.main().size());
	}

}
