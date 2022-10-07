//Author name: Renu Sharma

package TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import LabTest.Add_Multiply;

public class TestCase 
{
	@Test
	public void add()
	{
		assertEquals(30,Add_Multiply.addNum(10, 20));
	}
	
	@Test
	public void multiply()
	{
		assertEquals(200,Add_Multiply.multiply(10, 20));
	}
}
