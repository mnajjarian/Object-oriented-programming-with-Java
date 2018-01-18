
package application;

public class Main {

    public static void main(String[] args) {

    Sensor kumpula = new Thermometer();
    kumpula.on();
    System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

    Sensor kaisaniemi = new Thermometer();
    Sensor helsinkiVantaa = new Thermometer();

    AverageSensor helsinkiArea = new AverageSensor();
    helsinkiArea.addSensor(kumpula);
    helsinkiArea.addSensor(kaisaniemi);
    helsinkiArea.addSensor(helsinkiVantaa);

    helsinkiArea.on();
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    }
    
}
