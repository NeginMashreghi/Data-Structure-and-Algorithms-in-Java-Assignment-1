
package partThree.stackLinkList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part three > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 100742996, 	 100973300   > 
* Description:           < This class houses the methods for reading file content into a list, turning 
* 							into a character stack, and splitting a stack into two stacks >  
****************************************************************************************************/ 

public class MakeStack {

	/**
	 * Gets contents from a File object and inputs each line into a String stack.
	 * @param file File object with reference to file you want to become a stack.
	 * @return returns CustomStack[String], each node is a line inside the given file.
	 */
	public static CustomStack<String> getContents(File file){
		CustomStack<String> list = new CustomStack<String>(); 
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String string;
			
			while((string = reader.readLine()) != null){
				list.push(string);				
			}
			reader.close();
				
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * Takes each character in a string and inputs it into a Character stack.
	 * @param given String you want converted into a stack.
	 * @return returns a CustomStack[Character] object.
	 */
	public static CustomStack<Character> makeCharStack(String given){
		CustomStack<Character> charList = new CustomStack<Character>();
		String string = given;
		Character x;
		for(int i = 0; i < string.length(); i++){
			x = string.charAt(i);
			if( Character.isAlphabetic(x)){
				charList.push(Character.toLowerCase(x));
			}
		
		}
		return charList;	
	}
	/**
	 * Takes a given Character stack and empties half of it into another Character stack.
	 * @param given Character stack you want to split
	 * @return returns a new Character Stack with the top half of the given stack.
	 */
	public static CustomStack<Character> charStackSplit(CustomStack<Character> given){
		CustomStack<Character> charList = new CustomStack<Character>();
		int size = given.getSize();
		if(size % 2 == 0){
			size = size / 2 ;
			while(size > 0){
				charList.push(given.pop());
				size--;
			}
		}
		else{
			size = (size + 1) / 2;
			while(size > 0){
				if(size == 1){
					
					charList.push(given.getFirstNode().getInfo());
					size--;
				}
				else{
				charList.push(given.pop());
				size--;
				}
			}
		}			
			return charList;		
	}
	
}
