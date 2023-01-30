import java.util.*;   

public class Main { 
  
    public static Deck deck = new Deck();
    public static Scanner sc = new Scanner(System.in);
    public static int count = 0;
    public static ArrayList<Card> hand = new ArrayList<Card>();
    public static int pointTotal = 0;
    
  
    public static void main(String[] args){
        deck.shuffle2();
        dealCards(1);
        showPoints(); 
        boolean hitting = true;
        while(hitting){
          System.out.println("'wanna hit bro' or 'wanna stand bro'");
          String response = sc.nextLine();
          
          if(response.equals("hit")){
            dealCards(1);
            showPoints();
          } else if (pointTotal > 21) {
            System.out.println("You busted ur a dumbo!");
            break; 
          } else {
            break;
          }
        }
    }

    public static void dealCards(int n){
      int start = count;
      for(int i = count; i < start+n; i++){
        System.out.println(deck.cards[i]);
        hand.add(deck.cards[i]);
        count++;
      }
    }

    public static void showPoints(){
      int points = 0;
      for(int i = 0; i < hand.size(); i++){
        points += hand.get(i).getPoint();
      }
      System.out.println(points);
      pointTotal  = points;
    }
  
    public static void printDeck(){
        for(int i = 0;  i < 52; i++){
            System.out.println(deck.cards[i]);
        }
    }
}
 
