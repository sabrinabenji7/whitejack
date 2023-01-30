public class Deck {
 
    Card[] cards = new Card[52];
    
    public Deck(){
        int count = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                cards[count] = new Card(i, j);
                count++;
            }
        }
    }
    
    public void shuffle2(){
       for(int i = 0; i < 52; i++){
           int c = (int)(Math.random()*52);
           Card a = cards[c];
           cards[c] = cards[i];
           cards[i] = a;
       }  
        
    }
 }
