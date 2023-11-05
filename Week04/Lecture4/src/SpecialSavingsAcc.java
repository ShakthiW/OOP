public class SpecialSavingsAcc extends SavingsAcc {

    private static double withdrawalChg;
    private static double bonusRate;

    {
        withdrawalChg = 50.0;
        bonusRate = 0.05;
    }

    public SpecialSavingsAcc(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void addInterest() {
        super.addInterest();
        this.balance = this.balance+this.balance*bonusRate;
    }

    @Override
    public String toString() {
        return "SpecialSavingsAcc{" +
                "balance=" + balance +
                "bonusRate=" + bonusRate +
                '}';
    }
}
