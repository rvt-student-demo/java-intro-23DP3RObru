package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = this.balance + openingBalance;
    }

    public String toString() {
        return "The card has a balance of "+this.balance+" euros";
    }

    public void eatAffordably() {
        this.balance = this.balance - 2.60;
    }
    
    public void eatHeartily() {
        if (this.balance >= 4.60){
            this.balance = this.balance - 4.60;
        }
        
    }
}
