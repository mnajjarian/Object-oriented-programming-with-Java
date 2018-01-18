
package application;

import java.util.*;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensores;
    private final List<Integer> readings;
    
    public AverageSensor() {
        this.sensores = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    
    public void addSensor(Sensor additional) {
        this.sensores.add(additional);
    }

    @Override
    public boolean isOn() {
        for(Sensor s : sensores) {
        if(!s.isOn()) {
            return false;
        }
    }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s : sensores) {
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s : sensores) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if(!this.isOn() || this.sensores.isEmpty()) {
            throw new IllegalStateException();
        } else {
        int sum = 0;
        int average;
        for(Sensor s : sensores) {
            sum += s.measure();
        }
        average = sum / sensores.size();
        this.readings.add(average);
        
        return average;
    }
    }
    public List<Integer> readings() {
        return this.readings;
    }
    
}
