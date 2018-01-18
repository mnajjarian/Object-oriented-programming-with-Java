import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> list = new ArrayList<Card>();
    
    public void add(Card card) {
        this.list.add(card);
    }
    public void print() {
        for(Card p : this.list) {
            System.out.println(p);
        }
    }
    public void sort() {
        Collections.sort(this.list);
    }
    public int compareTo(Hand hand) {
        int sum1 = 0;
        for(Card card: this.list) {
            sum1 += card.getValue();
        }
        int sum2 = 0;
        for(Card card: hand.list) {
            sum2 += card.getValue();
        }
        if(sum1 < sum2) {
            return -1;
        } else if(sum1 == sum2) {
            return 0;
        } else {
            return 1;
        }
    }
    public void sortAgainstSuit(){
        Collections.sort(this.list, new SortAgainstSuitAndValue());
    }
}
