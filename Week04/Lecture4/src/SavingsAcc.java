public class SavingsAcc extends Account {

    private static double intRate;

    {
        intRate = 0.08;
    }

    public SavingsAcc(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance)
            this.balance = this.balance - amount;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance+amount;
    }

    public void addInterest()
    {
        this.balance = this.balance+this.balance*intRate;
    }

    public static void setIntRate(double intRate) {
        SavingsAcc.intRate = intRate;
    }

    @Override
    public String toString() {
        return super.toString()+"SavingsAcc{Interest Rate"+intRate+"}";
    }
}
