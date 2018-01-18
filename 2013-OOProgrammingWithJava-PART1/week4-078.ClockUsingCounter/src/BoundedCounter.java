
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
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
        this.value++;
        if (this.value > upperLimit) {
            this.value = 0;
        }
    }
        public String toString() {
            if (this.value < 10) {
                return "0" + value;
            } else {
            return "" + value;
        }
        }
}
    

