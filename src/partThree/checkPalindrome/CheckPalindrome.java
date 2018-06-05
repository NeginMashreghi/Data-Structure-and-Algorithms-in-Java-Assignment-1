package partThree.checkPalindrome;

import partThree.stackLinkList.CustomStack;
import partThree.stackLinkList.MakeStack;

/**************************************************************************************************** 
 * Project:               < Rocket > 
 * Assignment:            < assignment 1 - Part three > 
 * Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
 * Student Number:        < 100872220, 		101022808, 		101037323, 	100742996, 		100973300   > 
 * Description:           < This class houses the static checkPalindrome methods for Part 3. These methods check for 
 * 							Palindromes.>  
 ****************************************************************************************************/ 

public class CheckPalindrome {

	/**
	 * Runs through a given CustomStack[String] to check for palindromes
	 * @param list CustomStack[String] for input.
	 * @return returns a concatenated string of all found palindromes and its line index.
	 */
	
	public static String checkPalindromeStack(CustomStack<String> list){
		if(list.getSize() == 0){
			return "List is Empty";
		}
		CustomStack<String> given = list;		
		String result = "";
		int count = 0;
		while(given.getSize() > 0){
			String str = given.pop();
			
			if (testPalindrome(str)){
				result += count + " - " + str + ": is a palindrome\n";
			}
			count++;
		}
		return result;
		
	}
	
	/**
	 * Checks if a String is a palindrome using two Character stacks.
	 * a middle out method. 
	 * @param str A String you want to test.
	 * @return Returns true if the string is a palindrome.
	 */	 
	public static boolean testPalindrome(String str){
		CustomStack<Character> back = MakeStack.makeCharStack(str);
		CustomStack<Character> front = MakeStack.charStackSplit(back);
		boolean chkSuccess = true;
		while( back.getSize() > 0){
			if(back.pop() != front.pop()){
				chkSuccess = false;
				break;
			}
		}
		return chkSuccess;
	}




}
