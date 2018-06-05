
package partTwo.driver;

import partTwo.exceptions.COMP2080AssignmentInputException;
import partTwo.recursiveMethods.Recursive;

/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part two > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 	100742996, 		100973300   > 
* Description:           < driver for part 2. tests all 3 recursive methods in the Recursive class. >  
****************************************************************************************************/ 

public class TestRecursive {

	public static void main(String[] args) throws COMP2080AssignmentInputException {
		/*Test for Recursive.printWithSpaces(String str);		 */
		String nullValue = null;
		System.out.println("------------------------------------------------------\n");
		System.out.println("- printWithSpaces(WHAT IS THIS!? WHERE AM I) \n");
		Recursive.printWithSpaces("WHAT IS THIS!? WHERE AM I");
		Recursive.printWithSpaces("");
		Recursive.printWithSpaces(nullValue);
		System.out.println("");
		
		/*Test for Recursive.weave(String str1, String str2);		 */
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("- Weave(NOW and recurse)");		
		System.out.println(Recursive.weave("NOW", "recurse") + "\n");
		
		System.out.println("- Weave(\"\" and recurse)");
		System.out.println(Recursive.weave("", "recurse") + "\n");
		
		System.out.println("- Weave(NOW and \"\")");
		System.out.println(Recursive.weave("NOW", "") + "\n");
		
		//System.out.println(Recursive.weave("NOW", nullValue));
		
		
		/*Test for Recursive.lastIndexOf(char ch, String str);		 */
		System.out.println("\n------------------------------------------------------\n");		
		System.out.println("*<<<Custom Recursive.lastIndexOf>>>*\n");
		String two = "combustion";
		String three = "elliott";
		String four = "Canada";
		System.out.println("lastIndexOf(t  in combustion) \n");
		System.out.println(Recursive.lastIndexOf('t', "combustion")+ "\n");
		System.out.println("lastIndexOf(z in elliott) \n");
		System.out.println(Recursive.lastIndexOf('z', "elliott") + "\n");	
		System.out.println("lastIndexOf(a in Canada) \n");
		System.out.println(Recursive.lastIndexOf('a', "Canada")+ "\n");
		
		/*Comparing Recursive.lastIndexOf with String.lastIndexOf(); for confirmation		 */
		System.out.println("\n------------------------------------------------------\n");		
		System.out.println("*<<<Built-In String.lastIndexOf>>>*\n");
		System.out.println("lastIndexOf(t  in combustion) \n");
		System.out.println(two.lastIndexOf('t') + "\n");
		System.out.println("lastIndexOf(z in elliott) \n");
		System.out.println(three.lastIndexOf('z') + "\n");
		System.out.println("lastIndexOf(a in Canada) \n");
		System.out.println(four.lastIndexOf('a') + "\n");
		
		
	}

}
