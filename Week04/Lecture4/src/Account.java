public abstract class Account {

    private int accNo;
    protected double balance;

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", balance=" + balance +
                '}';
    }
}
