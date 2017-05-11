import com.tasks3.carddeck.Card;
import com.tasks3.carddeck.Rank;
import com.tasks3.carddeck.Suit;

import java.util.Random;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Deck {
    
    public final static int NUMBER_OF_CARD_IN_DECK = 36;
    public final static int NUMBER_OF_SUIT_FOR_CARD = 4;
    public final static int NUMBER_OF_RANK_FOR_CARD = 9;
    public int numberOfshuffle = 40;
    private Card[] deckCard = new Card[NUMBER_OF_CARD_IN_DECK];
    
    private int countCardInDeck = 0;  //counter number of cards in deck card
    
        
    public Deck(){
        int index = 0;
        for(int i = 0; i < NUMBER_OF_SUIT_FOR_CARD; i++){
            for(int j = 0; j < NUMBER_OF_RANK_FOR_CARD; j++){
                deckCard[index++] = new Card(Rank.values[j], Suit.values[i]);
                countCardInDeck++;
            }
        }
    }
    
    //Перемішує колоду у випадковому порядку 
    public void shuffle() {
        Random randomInt = new Random();
        Card[] tempDeckCard = new Card[NUMBER_OF_CARD_IN_DECK];
        Card tempCard = new Card(null,null);
        
        int toShiftCardsBeginningThis = 0;
        int toShiftCardsBeginningTo = 0;
        int countCardShifted = 0;
        
        for(int i = 1; i <= numberOfshuffle; i++){
            toShiftCardsBeginningThis = randomInt.nextInt(NUMBER_OF_CARD_IN_DECK);
            toShiftCardsBeginningTo = randomInt.nextInt(NUMBER_OF_CARD_IN_DECK);
                // change two cards into the deck card at the random order
            tempCard = deckCard[toShiftCardsBeginningTo];
            deckCard[toShiftCardsBeginningTo] = deckCard[toShiftCardsBeginningThis];
            deckCard[toShiftCardsBeginningThis] = tempCard;
           
        }
        
    }
    
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int index = 0;
        countCardInDeck = 0;

        for(int i = 0; i < NUMBER_OF_SUIT_FOR_CARD; i++){
            for(int j = 0; j < NUMBER_OF_RANK_FOR_CARD; j++){
                deckCard[index++] = new Card(Rank.values[j], Suit.values[i]);
                countCardInDeck++;
            }
        }
    }
    
    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if(0 == countCardInDeck){
            return false;
        }
        return true;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        Card oneCard;
        if(countCardInDeck > 0){
            oneCard = deckCard[countCardInDeck - 1];
            countCardInDeck--;
            return oneCard;
        }
        return null; // null - the deck card is empty
    } 
    
    public static void main(String[] args)
    {
        Deck testDeckCard = new Deck();
        Card testCard = new Card(null,null);

        int valueCase = 1;
        
        while(valueCase <= 3){
            switch(valueCase){
                case 1:{
                    System.out.println("=========TESTING of the constractor Deck() ===============");
                    break;  //create and print testDeckCard
                }
                case 2:{
                    testDeckCard.order();
                    System.out.println("=========TESTING of the method order() before of the method shuffle() ===============");
                    testDeckCard.shuffle();
                    System.out.println("=========TESTING of the method shuffle() ===============");
                    break;
                }
                case 3:{
                    testDeckCard.order();
                    System.out.println("=========TESTING of the method order() ===============");
                    break;
                }
                default: break;
            } 
            valueCase++;
            for(int i = 0; i <= Deck.NUMBER_OF_CARD_IN_DECK; i++){
                System.out.print("hasNext()= " + testDeckCard.hasNext() + ", card is:  ");
                testCard = testDeckCard.drawOne();
                if(null != testCard){                
                    System.out.println(testCard.getRank().getName() + "  " + testCard.getSuit().getName());
                }
                else{
                    System.out.print("hasNext()= " + testDeckCard.hasNext() + ". ");
                    System.out.println("END of deck card");
                }
            }
        }
    }
}  