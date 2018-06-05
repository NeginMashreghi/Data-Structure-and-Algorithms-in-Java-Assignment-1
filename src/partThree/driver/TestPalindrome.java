package partThree.driver;

import java.io.*;
import partThree.checkPalindrome.CheckPalindrome;
import partThree.stackLinkList.*;

/**************************************************************************************************** 
** Project:               < Rocket > 
 * Assignment:            < assignment 1 - Part three > 
 * Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
 * Student Number:        < 100872220, 		101022808, 		101037323,  100742996, 	 100973300   > 
* Description:           < driver for testing Part 3>  
****************************************************************************************************/
public class TestPalindrome {

	public static void main(String[] args) {
		
		try{
			
			File file = new File ("src/partThree/driver/palindrome.txt");  
			//turns the file into a stack of strings.
			CustomStack<String> fileContents = MakeStack.getContents(file); 
			System.out.println("All lines from palindrome.txt file\n---------------------");
			
			//displays the contents of the stack.
			System.out.println(fileContents.displayListItems()); 
			System.out.println("Palindrome Check results\n--------------------");
			
			//prints the results of the palindrome check.
			System.out.println(CheckPalindrome.checkPalindromeStack(fileContents)); 
			
			
			System.out.println(CheckPalindrome.checkPalindromeStack(fileContents));
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	
	

}
