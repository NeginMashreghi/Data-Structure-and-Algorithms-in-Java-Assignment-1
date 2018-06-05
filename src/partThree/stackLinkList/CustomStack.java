package partThree.stackLinkList;


/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part three > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 100742996, 	 100973300   > 
* Description:           < Part three ADT stack linked list >  
****************************************************************************************************/ 
public class CustomStack<T> implements CustomStackInterface<T> {

	private int size ;
	private Node<T> firstNode;

    public CustomStack(){
    	this.firstNode = null;
    	this.size = 0 ;
	}
    /**
     * @return returns the size of the stack.
     */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Gets the references to the first node in the stack
	 * @return returns firstNode reference.
	 */
	public Node<T> getFirstNode(){
		return this.firstNode;
	}
	
	/**
	 * Puts input to the top of the stack.
	 * @param info The information you want to put in the stack.
	 */
	public void push(T info){
		Node<T> temp = new Node<T>(info);
		temp.setNode(this.firstNode);
		this.firstNode = temp;
		this.size++;
	}
		
	/**
	 * displays all items in the stack
	 * @return returns a concatenated String with all items and their indexes.
	 */
	public String displayListItems(){
		Node<T> currNode = this.firstNode;
		String nodeInfo = "";
		int cnt = 0;
		while(currNode != null){
			nodeInfo += cnt + ": " + currNode.toString();
			currNode = currNode.getNode();
			cnt ++;
			
		}
		return nodeInfo;
	}
	
	/**
	 * Removes node from the top of the stack and returns its contents.
	 * @return returns contents from the popped node.
	 */
	public T pop(){
		T info = firstNode.getInfo();
		firstNode = firstNode.getNode();
		size--;
		return info;
	}
	
	
	
	
}
