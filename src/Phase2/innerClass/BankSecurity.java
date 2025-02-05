package Phase2.innerClass;
// we will use inner class to make this secure
public class BankSecurity {
    // as you can see someone can create object of this class and change values so no secure
    /*
    private double bal;
    private double rate;
    void calInterest() {
        double interest = bal * rate/100;
        bal += interest;
        System.out.println("Balance amount = " +bal);
    }
     */
    //now via private class, only people authorized can access to this
    private double bal;
    private String password = "Vali 123";
    BankSecurity(double initialBalance) {
        if (initialBalance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.bal = initialBalance;
    }
    public double getBalance() {
        return bal;
    }
    public void setBalance(double bal) {
        if (bal < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.bal = bal;
    }
    private class Interest{
        private double rate;
        void setRate(double rate) {
            if (rate < 0) {
                throw new IllegalArgumentException("Interest rate cannot be negative.");
            }
            this.rate = rate;
        }
        void calInterest() {
            double interest = bal * rate/100;
            bal += interest;
            System.out.println("Balance = " +bal);
        }
    }
}
