
package containers;

public final class ProductContainerRecorder extends ProductContainer {
    private final ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    public String history() {
        return containerHistory.toString();
    }
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerHistory.add(super.getVolume());
    }
    @Override
    public double takeFromTheContainer(double amount) {
        double val = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerHistory.add(this.getVolume());
        return val - this.getVolume();
        
    }
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.history());
        System.out.println("Greatest product amount: "+this.containerHistory.maxValue());
        System.out.println("Smallest product amount: "+this.containerHistory.minValue());
        System.out.println("Average: "+this.containerHistory.average());
        System.out.println("Greatest change: "+this.containerHistory.greatestFluctuation());
        System.out.println("Variance: "+this.containerHistory.variance());
    }
    
}
