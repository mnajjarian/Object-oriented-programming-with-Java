import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stocks;
    
    public Storehouse() {
        this.store = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.store.put(product, price);
        this.stocks.put(product, stock);
        
    }
    public int price(String product) {
        if(this.store.containsKey(product)) {
            return this.store.get(product);
        } else {
            return -99;
        } 
    }
    public int stock(String product) {
        if(this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }
    public boolean take(String product) {
        if(this.stocks.containsKey(product) && this.stocks.get(product) > 0) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            this.stocks.values();
            return true;
        } else {
            return false;
    }
}
    public Set<String> products() {
        Set<String> keys = new HashSet<String>();
        
        for(String key : stocks.keySet()) {
            keys.add(key);
        }
        return keys;
    }
}
