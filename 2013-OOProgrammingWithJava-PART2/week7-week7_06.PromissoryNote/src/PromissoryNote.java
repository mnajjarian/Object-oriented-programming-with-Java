import java.util.HashMap;
import java.util.Map;
public class PromissoryNote {
    private Map<String, Double> loanAmount;
    
    public PromissoryNote() {
        this.loanAmount = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value) {
        this.loanAmount.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose) {
        if (loanAmount.containsKey(whose)) {
            double loan = loanAmount.get(whose);
            return loan;
        }
            return 0;
        }
    }
