package edu.utils.app;

import static org.junit.Assert.*;

import org.junit.Test;
import static edu.utils.app.Application.*;

public class ApplicationTest {

	@Test
	public void givenPalindrome_ThenShouldReturnTrueTest() {
		String input = "112233445544332211";
		
		assertTrue(isPalindrome(input));
	}
	
	
	@Test
	public void givenCustomString_ThenShouldReturnFalseTest() {
		String input = "sdfg344554322gfh11";
		
		assertFalse(isPalindrome(input));
	}
	
	@Test
	public void givenTwoStrings_WhenFirstIsLonger_ThenShouldReturnFirstTest() {
		String longer = "i am longer than another";
		String smaller = "LOL what";
		
		assertEquals(longer, selectLongestPalindrome(longer, smaller));
	}
	
	@Test
	public void givenTwoStrings_WhenSecondIsLonger_ThenShouldReturnSecondTest() {
		String longer = "i am longer than another";
		String smaller = "piss off, you son of a bitch, i'll kill your family";
		
		assertEquals(smaller, selectLongestPalindrome(longer, smaller));
	}
	
	@Test
	public void givenNumberAsString_WhenSplitted_ThenShouldReturnSumOfNumbersTest() {
		String inputString = "12345";
		
		assertEquals(15, getSumBySplitting(inputString));
	}
	
	@Test
	public void givenNumberAsString_WhenDividedByTen_ThenShouldReturnSumOfNumbersTest() {
		String inputString = "985693";
		
		assertEquals(40, getSumByDividing(inputString));
	}
	
	@Test
	public void givenTwoNumbers_WhenMultipliedAllPossibleVariations_ShouldReturnLongestPalyndrome() {
		int start = 1000;
		int end = 9999;
		
		assertEquals("99000099", findLongestPalindromeFromMultuplying(start, end));
	}
}
