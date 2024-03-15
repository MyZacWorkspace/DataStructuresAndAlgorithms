package s1338565.edu.monmouth.cardList;

import s1338565.edu.monmouth.Cards.*;

public class ListCardNode {
	  private CardNode head; 

	  public ListCardNode() {
	    head = null;
	  }
	  
	  public CardNode remove(Card searchValue) { 
		// placeholder
		return null;
	  }
	  
	 public CardNode insertAfter(Card searchValue, Card element) { 
		// placeholder
		return null;
	}
	 

	  public void insert(Card element) {
		  
	  }

	  public void insertEnd(Card element) {
	} 

	  public boolean isEmpty() {              
	    	// placeholder
		return true;
	  }
	  
	  public int size() {
	  	// placeholder
		return 0;
	  }
	  
	  public void clear() {
	    
	  }

	@Override
	  public String toString() {
		// placeholder
		return "";
	  }
	//Just using head 
	public String printReverse() {
		CardNode currentNode = head;
		//Get Last
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		//Start from Last to first
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(currentNode.getPrevious() != null)
		{
			sb.append(currentNode + ", ");
			currentNode = currentNode.getPrevious();
		}
		sb.append(currentNode);
		sb.append("]");

		return sb.toString();
	}
}
