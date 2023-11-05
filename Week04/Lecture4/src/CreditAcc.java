public class CreditAcc extends Account {
    private double creditLimit;

    public CreditAcc(int accNo, double balance, double creditLimit) {
        super(accNo, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount+balance<=creditLimit)
            this.balance = this.balance+amount;
        else
            System.out.println("You are exceeding the credit limit, You cannot withdraw the requested amount");
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance-amount;
    }

    @Override
    public String toString() {
        return "CreditAcc{" +
                "creditLimit=" + creditLimit +
                ", balance=" + balance +
                ", accNo=" + this.getAccNo() +
                '}';
    }
}
