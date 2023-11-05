public class Main {
    public static void main(String[] args) {
SavingsAcc sa1 = new SavingsAcc(1001,5000.0);
        System.out.println(sa1);
        sa1.deposit(1500.0);
        System.out.println(sa1);
        sa1.withdraw(250.0);
        System.out.println(sa1);
        CreditAcc ca1 = new CreditAcc(1002,0.0,10000.0);
        System.out.println(ca1);
        ca1.withdraw(8000.0);
        System.out.println(ca1);
        SpecialSavingsAcc ssacc = new SpecialSavingsAcc(1003,9000.0);
        sa1.addInterest();
            System.out.println(sa1);
            ssacc.addInterest();
            System.out.println(ssacc);
            //polymorphism advantage - maintain one single Account array
            Account[] accountArray = new Account[3];
            accountArray[0] = sa1;
            accountArray[1] = ca1;
            accountArray[2] = ssacc;
            for(Account acc: accountArray)
            {
                    System.out.println(acc.toString());
            }



    }
}