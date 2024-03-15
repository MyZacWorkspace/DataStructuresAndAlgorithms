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
	  
	  //FIXME will need to account for null card value parameters (also if list is empty)
	 public CardNode insertAfter(Card searchValue, Card element) { 

		CardNode currentNode = head;
		
		while(!(currentNode.getCard().equals(searchValue)) && currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}

		CardNode cardInsert = new CardNode(element);
		currentNode.setNext(cardInsert);

		return cardInsert;
	}
	 

	  public void insert(Card element) {
		  
	  }

	  //FIXME will need to account for null card value parameter (also if list is empty)
	  public void insertEnd(Card element) {
		CardNode currentNode = head;
		while(currentNode != null || currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(new CardNode(element));
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
		while(currentNode != null || currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		//Start from Last to first
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(currentNode != null || currentNode.getPrevious() != null)
		{
			sb.append(currentNode + ", ");
			currentNode = currentNode.getPrevious();
		}
		sb.append(currentNode);
		sb.append("]");

		return sb.toString();
	}
}
