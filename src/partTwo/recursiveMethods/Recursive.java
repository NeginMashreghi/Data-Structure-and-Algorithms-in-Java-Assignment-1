package partTwo.recursiveMethods;
import partTwo.exceptions.*;

/**************************************************************************************************** 
 * Project:               < Rocket > 
 * Assignment:            < assignment 1 - Part two > 
 * Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
 * Student Number:        < 100872220, 		101022808, 		101037323, 	100742996, 		100973300   > 
 * Description:           < This class holds static recursion methods for part 2.
 * 							These methods add spaces to a string, weave two strings together, and find 
 * 							the last index of a character in a given string.>  
 ****************************************************************************************************/ 
public class Recursive {

	/**
	 * Prints given String argument with spaces between each character.
	 * @param word String you want processed.
	 */
	public static void printWithSpaces(String word)  {
		
		if(word != null && word.length() > 0){
			System.out.print(word.charAt(0) + " ");
			printWithSpaces(word.substring(1));
		}
	}

	/**
	 * Combines two strings together using recursion. Weaves the strings together starting with the first argument.
	 * @param str1 First string. Weaving starts with this parameter
	 * @param str2 Second string. 
	 * @return returns single string with the given arguments weaved together.
	 * @throws COMP2080AssignmentInputException if either input is Null.
	 */
	public static String weave(String str1, String str2) throws COMP2080AssignmentInputException {		

		if( str1 == null ||  str2 == null ){
			throw new COMP2080AssignmentInputException("Null input");
		}

		String conCat = "";

		if (str1.length() > 0 && str2.length() > 0){		
			conCat += str1.substring(0,1) + str2.substring(0,1) +		
					weave(str1.substring(1), str2.substring(1));
		}
		else if (str1.equals("") || str2.equals("")){
			conCat += str1 + str2;
		}   		
		return conCat;
		
	}

	/**
	 * finds the last index of a given character in a given string using recursion.
	 * @param ch Character to be searched for.
	 * @param string String to be searched.
	 * @return returns the characters index number if found. Returns -1 if not found.
	 */
	public static int lastIndexOf(char ch, String string){

		int len = string.length();

		if(len > 0 && string.charAt(len - 1) != ch){		
			return lastIndexOf(ch, string.substring(0, len - 1));
		}
		if ( len > 0 && string.charAt(len - 1) == ch){			
			return len - 1;
		}		
		return -1;
	}


}
