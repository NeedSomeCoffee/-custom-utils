package edu.utils.app;

import java.util.logging.Logger;

public class Application {
	private static final Logger LOGGER = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		String inputString = "12345";
				
		int sum = getSumBySplitting(inputString);
		
		LOGGER.info(String.valueOf(sum)); 
		
		inputString = "983456897";
		
		sum = getSumByDividing(inputString);
		
		LOGGER.info(String.valueOf(sum));
			

		int start = 1000;
		int finish = 9999;
		
		LOGGER.info(findLongestPalindromeFromMultuplying(start, finish));
	}
	
	public static int getSumBySplitting(String input) {
		int sum = 0;
				
		String[] splitted = input.split("");
		
		for(String character : splitted) {
			
			sum += Integer.valueOf(character);
		}
		
		return sum;
	}
	
	public static int getSumByDividing(String input) {
		int sum = 0;
		int converted = Integer.valueOf(input);		
		
		for(int i = 0; i < input.length(); i++) {
			
			sum += converted %10;
			converted /= 10;
		}
		
		return sum;
	}
	
	public static String findLongestPalindromeFromMultuplying(int one, int two) {
		String longestPalindrome = "";		
		
		for(int i = one; i <= two; i++) {
			for(int j = one; j <= two; j++) {
				
				String multiplicationResult = String.valueOf(i * j);
				
				if(isPalindrome(multiplicationResult)) {
					
					longestPalindrome = selectLongestPalindrome(longestPalindrome, multiplicationResult);
				}				
			}
			
		}	
		
		return longestPalindrome;
	}
	
	public static String selectLongestPalindrome(String one, String two) {
		return one.length() > two.length() ? one : two;
	}
	
	public static boolean isPalindrome(String input) {
		
		return input.equals(new StringBuilder(input).reverse().toString());
	}
}
