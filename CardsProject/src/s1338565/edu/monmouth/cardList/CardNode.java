package s1338565.edu.monmouth.cardList;

import s1338565.edu.monmouth.Cards.*;

public class CardNode 
{
	private Card card;
	private CardNode next, previous;
  
  public CardNode(Card card) {
    this.card = card;
    next = previous = null;
  }
 
  public void setCard(Card card) {
    this.card = card;
  }

  public Card getCard() {
	
	return this.card;
  }

  public void setPrevious(CardNode link) {
	this.previous = link;
  }

 public CardNode getPrevious() {
	
	return this.previous;	 
 }
	  
  public void setNext(CardNode link) {
  this.next = link;  
  }

  public CardNode getNext() {
	
	return this.next;    
  }
  
  @Override 
  public String toString() {
   
	return this.card.toString();
	  
  }
}
