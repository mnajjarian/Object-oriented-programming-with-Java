public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginning);
        this.minutes = new BoundedCounter(minutesAtBeginning);
        this.seconds = new BoundedCounter(secondsAtBeginning);
// the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        if (seconds.getValue() == 59) {
            if (minutes.getValue() == 59) {
                if (hours.getValue() == 23) {
                    hours.setValue(0);
                } else {
                    hours.next();
                }
            }
            minutes.next();
            seconds.next();
        } else {
            seconds.next();
        }
        // Clock advances by one second
    }
    
    public String toString() {
        return "" + this.hours + ":" + this.minutes + ":" + this.seconds;
        // returns the string representation
    }
}
