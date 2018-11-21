import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet = 0;
	
	private ArrayList<Card> oneRoundCard; 
	public Player(String name, int chips){
		this.name = name;
		this.chips = chips;
		
	}
	
	public String getName(){
		return name;
	}
	
	 public int makeBet(){
		 if (chips > 0){
			 bet =1;
		 }
		 
		 else if (chips <= 0){
			 bet = 0;
		 }
		 return bet;
	 }
	
	 public void setOneRoundCard(ArrayList<Card> cards) {
		 
		 oneRoundCard=cards;
	 }
	
	 public boolean hitMe() {
		
		 if(getTotalValue() < 17)
			  return true;
		 else return false;
			 
		
	 }
	
	 public int getTotalValue() {
		 int sum = 0;
		 for(Card card :oneRoundCard){
			 sum += card.getRank();
			 if (card.getRank()==11||card.getRank()==12||card.getRank()==13){
				 sum += 10;
			 }
			 
			 
			 else if (card.getRank()==1){
				 if(sum<10){
					 sum+=1;
					 
				 }
				 else {
					 sum +=11;
					 } 
			 }
			 
			 
			 
			 
			 
			 
		 }
			 
		 return sum;
		 
	 }
	
	 public int getCurrentChips() {
		 
  	   return chips;
  	   
     }
     
     public void increaseChips(int diff){
    	 
  	   chips += diff;
  	   
     }
     public void sayHello() {
    	 
  	   System.out.println("Hello, I am " + name + ".");
  	   System.out.println("I have " + chips + " chips.");
  	   
  	   
     }
     
}


