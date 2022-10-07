//Author name: Renu Sharma

package TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import LabTest.Palindrome;

public class PalindromeTest 
{
	@DisplayName(value="Checking String is palindrome or not....")
	@ParameterizedTest
	@ValueSource(strings  = {"eye","12321","rotator","peep"})
	public void isPalindromeTest(String str)
	{
		assertTrue(Palindrome.palindrome_check(str));
	}
}
