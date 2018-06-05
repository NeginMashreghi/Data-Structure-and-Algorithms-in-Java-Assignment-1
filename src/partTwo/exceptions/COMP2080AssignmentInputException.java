package partTwo.exceptions;

import java.lang.Exception;

/**************************************************************************************************** 
 * Project:               < Rocket > 
 * Assignment:            < assignment 1 - Part two > 
 * Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
 * Student Number:        < 100872220, 		101022808, 		101037323, 	100742996, 		100973300   > 
 * Description:           < Custom exception for part 2>  
 ****************************************************************************************************/ 
public class COMP2080AssignmentInputException extends Exception {

	
	private static final long serialVersionUID = 1L;
	/**
	 * Custom exception for assignment 1, part 2b.
	 * @param message put in a custom message
	 */
	public COMP2080AssignmentInputException(String message){
		super(message);
	}
}
