package Card_Shuffler;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards(){
        return cards;
    }
    public void addCard(Card card) {
        cards.add(card);
    }

    public void print(){
        for (Card c : cards)
            System.out.println(c.toString());

    }
    public void shuffle(){
        Random rand = new Random();
        ArrayList<Card> shuffledList = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            int randInt = rand.nextInt(cards.size());
            if (shuffledList.contains(cards.get(randInt))) {
                continue;
            }
            shuffledList.add(cards.get(randInt));
        }
        cards = shuffledList;
    }
    public Deck deal(int count){
        Deck hand = new Deck();
        if(count == 5) {
            for (int i = 0; i < count; i++) {
                hand.addCard(cards.remove(i));
            }
        }return hand;
    }


}