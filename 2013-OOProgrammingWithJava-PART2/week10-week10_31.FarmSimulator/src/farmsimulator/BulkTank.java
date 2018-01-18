
package farmsimulator;

public class BulkTank {
    private final double TANK_CAPACITY = 2000;
    private final double tankCapacity;
    private double volume;
    
    public BulkTank() {
        this.tankCapacity = TANK_CAPACITY;
        this.volume = 0;
    }
    public BulkTank(double capacity) {
        this.tankCapacity = capacity;
        this.volume = 0;
    }
    public double getCapacity() {
        return this.tankCapacity;
    }
    public double getVolume() {
        return volume;
    }
    public double howMuchFreeSpace() {
        return tankCapacity - volume;
    }
    public void addToTank(double amount) {
        volume += amount;
        if(volume > tankCapacity) {
            volume = this.tankCapacity;
        }
    }
    public double getFromTank(double amount) {
        if(volume - amount < 0) {
            double i = this.volume;
            this.volume = 0;
            return i;
        } else {
            volume -= amount;
            return amount;
        }
        
    }
    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
