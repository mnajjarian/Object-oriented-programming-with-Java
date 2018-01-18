
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        if (number != -1) {
            this.sum = this.sum + number;
        }
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum = this.sum;
        return sum;
    }

    public double average() {
        if (this.amountOfNumbers > 0) {
            return (double) this.sum / this.amountOfNumbers;
        } else {
            return 0;
        }
    }
}
