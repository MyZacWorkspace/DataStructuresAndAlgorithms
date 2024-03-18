package s1338565.edu.monmouth.cardList;

import s1338565.edu.monmouth.Cards.*;

public class ListCardNode {
	  private CardNode head; 
	  private CardNode tail;

	  public ListCardNode() {
	    head = null;
		tail = null;
	  }

	  public CardNode getTail()
	  {
		return tail;
	  }
	  
	  //Only works for one instance of the Card we want to remove
	  //Since there are no repeats in a deck, this works in the practical sense
	  public CardNode remove(Card searchValue) { 
		
		CardNode currentNode = head;
		if(isEmpty())
		{
			return null;
		}
		while(currentNode != null)
		{
			if(currentNode.getCard().equals(searchValue))
			{
				currentNode.getPrevious().setNext(currentNode.getNext());
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	  }
	  
	  //FIXME will need to account for null card value parameters (also if list is empty)
	  //Inserts at end if entry is not found
	 public CardNode insertAfter(Card searchValue, Card element) { 

		CardNode currentNode = head;
		
		while(!(currentNode.getCard().equals(searchValue)) && currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}

		CardNode cardInsert = new CardNode(element);
		cardInsert.setPrevious(currentNode);
		cardInsert.setNext(currentNode.getNext());
		currentNode.setNext(cardInsert);

		if(cardInsert.getNext() == null)
		{
			tail = cardInsert;
		}
		return cardInsert;
	}
	 

	  public void insert(Card element) {
		CardNode newNode = new CardNode(element);

		newNode.setNext(head);
		if(!isEmpty())
		{
			head.setPrevious(newNode);
		}


		head = newNode;
		if(size() == 1)
		{
			tail = newNode;
		}
		if(size() == 2)
		{
			tail = newNode.getNext();
		}
		
		  
	  }

	  //FIXME will need to account for null card value parameter (also if list is empty)
	  public void insertEnd(Card element) {
		CardNode currentNode = head;
		if(isEmpty())
		{
			//Same implementation
			insert(element);
		}
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		CardNode cardInsert = new CardNode(element);
		cardInsert.setPrevious(currentNode);
		currentNode.setNext(cardInsert);
		tail = cardInsert;
	} 

	  public boolean isEmpty() {    
		if(head == null)
			return true;          
		return false;
	  }
	  
	  public int size() {
		CardNode currentNode = head;
		int count = 0;
	  	if(!(isEmpty()))
		{
			while(currentNode != null)
			{
				count++;
				currentNode = currentNode.getNext();
			}

			return count;
		}

		return count;
	  }
	  
	  public void clear() {
		head = null;
	    
	  }

	@Override
	  public String toString() 
	  {
		CardNode currentNode = head;

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		if(!isEmpty())
		{
			while(currentNode != null)
			{
				if(currentNode.getNext() == null)
					sb.append(currentNode);
				else
					sb.append(currentNode + ", ");

				currentNode = currentNode.getNext();
			}
		}

		sb.append("]");

		return sb.toString();
		
	  }


	//PrintReverse now with tail
	public String printReverse()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		CardNode currentNode = tail;

		if(!isEmpty())
		{
			while(currentNode != null)
			{
				if(currentNode.getPrevious() == null)
					sb.append(currentNode);
				else
					sb.append(currentNode + ", ");

				currentNode = currentNode.getPrevious();
			}
		}

		sb.append("]");

		return sb.toString();
	}

	public int howMany(Card element)
	{
		int counter = 0;
		CardNode currentNode = head;

		if(isEmpty())
		{
			return 0;
		}
		else
		{
			do
			{
				if(currentNode.getCard().equals(element))
					counter++;
				currentNode = currentNode.getNext();
			}while(currentNode != null);
		}

		return counter;
	}

	public void uniqueInsert(Card element)
	{
		if(howMany(element) == 0)
			insert(element);
		else
			System.out.println("Card already exists");
	}

	//Just using head 
	/*
	public String printReverse() {
		CardNode currentNode = head;
		//Get Last
		if(!isEmpty())
		{
			while(currentNode.getNext() != null)
			{
				currentNode = currentNode.getNext();
			}
		}
		
		//Start from Last to first
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		if(!isEmpty())
		{
			while(currentNode != null)
			{
				if(currentNode.getPrevious() == null)
					sb.append(currentNode);
				else
					sb.append(currentNode + ", ");

				currentNode = currentNode.getPrevious();
			}
		}
		
		sb.append("]");

		return sb.toString();
	}
	*/
}
