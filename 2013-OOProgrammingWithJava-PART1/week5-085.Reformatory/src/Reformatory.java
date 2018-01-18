public class Reformatory {
    private int total;

    public int weight(Person person) {
        this.total++;
        // return the weight of the person
        return person.getWeight();
    }
    public void feed(Person person) {
        int i = person.getWeight();
        i++;
        person.setWeight(i);
        
    }
    public int totalWeightsMeasured() {
        return total;
    }

}
