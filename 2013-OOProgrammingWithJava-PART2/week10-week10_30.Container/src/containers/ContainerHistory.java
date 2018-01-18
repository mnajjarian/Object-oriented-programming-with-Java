
package containers;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
    private final List<Double> container;
    
    public ContainerHistory() {
        this.container = new ArrayList<Double>();
    }
    public void add(double situation) {
        container.add(situation);
    }
    public void reset() {
        container.removeAll(container);
    }
    public double maxValue() {
        if(container.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.container);
  
    }
    public double minValue() {
        if(container.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.container);
    }
    public double average() {
        if(container.isEmpty()) {
            return 0;
        }
        double a = 0;
        for(double v : this.container) {
            a += v;
        }
        return a / container.size();
    }
    public double greatestFluctuation() {
        
        if(container.isEmpty() || container.size() == 1) {
            return 0;
        }
        double max = 0;
        int i = 0;
        for(double temp : container) {
            double temp1 = this.container.get(i+1);
            double maxTemp = Math.abs(temp - temp1);
            if(maxTemp > max) {
                max = maxTemp;
            }
            i++;
            if(i >= this.container.size() -1) {
                break;
            }
        }
        return max;
    }
    public double variance() {

        double mean = average();
        double sum = 0;
        for (double a : this.container) {
            sum += Math.pow((a - mean), 2);
        }
        return sum / (this.container.size() -1);
    }
    @Override
    public String toString() {
        return this.container.toString();
    }

}
