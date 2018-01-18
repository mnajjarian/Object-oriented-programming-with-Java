
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    public void loadMoney(double amount) {
        if (amount > 0) {
        this.balance = this.balance + amount;
        
        double i = 150;
        if (this.balance > i){
            this.balance = i;
        }
    }
    }
    public void payEconomical() {
        if (this.balance >= 2.50)
        this.balance = this.balance - 2.50;
        if (this.balance <= 2.5) {
            this.balance = this.balance;
        }
    }
    public void payGourmet() {
        if (this.balance >= 4) 
        this.balance = this.balance - 4.00;
        if (this.balance <= 4) {
            this.balance = this.balance;
        }
    }
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
}
