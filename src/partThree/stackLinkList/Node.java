package partThree.stackLinkList;

/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part three > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 100742996, 	100973300   > 
* Description:           <Class to make linked list node objects >  
****************************************************************************************************/ 
public class Node<T> {
	
	private T info;
	private Node<T> node = null;
	/**
	 * returns Node info.
	 * @return returns info of Datatype T.
	 */
	public T getInfo() {
		return info;
	}
	/**
	 * Sets info for Node.
	 * @param info Data you want stored.
	 */
	public void setInfo(T info) {
		this.info = info;
	}
	/**
	 * Returns reference to the Node this Node links to.
	 * @return returns Node reference for next node.
	 */
	public Node<T> getNode() {
		return node;
	}
	/**
	 * Set the Node reference this Node will point to.
	 * @param node Node you want to this node to point to.
	 */
	public void setNode(Node<T> node) {
		this.node = node;
	}
	/**
	 * Constructor for Node
	 * @param ty information to instantiate this Node with.
	 */
	public Node(T ty){
		setInfo(ty);
	}
	
	/**
	 * return string of Node.Info
	 * @return returns a string of this Node's stored information.
	 */
	public String toString(){
		return this.info.toString() + "\n";
		
	}
	

}
