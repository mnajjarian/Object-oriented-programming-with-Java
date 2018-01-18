
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.00;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        double i = cashGiven;
        double lunchPrice = 2.50;
        if (i >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.economicalSold++;
            return cashGiven - lunchPrice;
        } else {
            return cashGiven;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
    }

    public double payGourmet(double cashGiven) {
        double i = cashGiven;
        double lunchPrice = 4.00;
        if (i >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.gourmetSold++;
            return cashGiven - lunchPrice;
        } else {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }
    public boolean payEconomical(LyyraCard card) {
        double lunchPrice = 2.50;
        if (card.balance() >= lunchPrice) {
            this.economicalSold++;
            card.pay(lunchPrice);
            return true;
        } else {
            return false;
        }
    }
    public boolean payGourmet(LyyraCard card) {
        double lunchPrice = 4.00;
        if (card.balance() >= lunchPrice) {
            this.gourmetSold++;
            card.pay(lunchPrice);
            return true;
        } else {
            return false;
        }
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
        card.loadMoney(sum);
        this.cashInRegister += sum;
    } else {
            this.cashInRegister = this.cashInRegister;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}