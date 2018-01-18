
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit) {
        this.value = upperLimit;
        this.upperLimit = 59;
    }
    public int getValue () {
        return this.value;
    }
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperLimit) {
            this.value = newValue;
        }
        
    }
    
    public void next() {
        
        if (this.value < upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
        public String toString() {
            if (this.value <= 9) {
                return "0" + value;
            } else {
            return "" + value;
        }
        }
}
    

