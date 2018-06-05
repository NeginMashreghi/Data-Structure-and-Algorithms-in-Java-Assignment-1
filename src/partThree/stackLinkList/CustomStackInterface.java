package partThree.stackLinkList;
/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part three > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 101022808, 101037323, 100742996, 100973300   > 
* Description:           < Custom interface for CustomStack<T> >  
****************************************************************************************************/ 
public interface CustomStackInterface<T>{
	/**
	 * Get the size of the stack
	 * @return returns stack size as an int.
	 */
	int getSize() ;
	/**
	 * Add a Node to the top of the stack.
	 * @param info data you want stored in the Node.
	 */
	void push(T info);
	/**
	 * Displays the contents of each Node in the stack.
	 * @return returns a concatenated String of all contents in the list and their index.
	 */
	String displayListItems() ;
	/**
	 * Removes a Node from the top of the Stack and returns its contents.
	 * @return returns contents of top Node. Datatype T.
	 */
	T pop();

}
