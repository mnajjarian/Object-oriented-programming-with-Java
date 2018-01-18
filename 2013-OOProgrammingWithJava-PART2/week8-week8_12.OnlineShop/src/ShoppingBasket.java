
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private final Map<String, Purchase> purchases;
    
    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
        
    }
    public void add(String product, int price) {
        if(this.purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            purchases.put(product, purchase);
        }
        
    }
    public int price() {
        int val = 0;
        for(Purchase v : purchases.values()) {
            val += v.price();
        }
        return val;
    }
    public void print() {
        for(Purchase p : purchases.values()) {
            System.out.println(p);
        }
    }
}
