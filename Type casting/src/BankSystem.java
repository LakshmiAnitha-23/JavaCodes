class Account
{
    void showDetails()
    {
        System.out.println("General Account Details");
    }
}

class SavingsAccount extends Account
{
    void showDetails()
    {
        System.out.println("savings account details");
    }

    void calculateInterest()
    {
        System.out.println("Interest calculated");

    }
}

public class BankSystem
{
    public static void main(String[] args)
    {
        Account acc = new SavingsAccount();
        acc.showDetails();

        if(acc instanceof SavingsAccount)
        {
            SavingsAccount sa = (SavingsAccount) acc;
            sa.calculateInterest();
        }
    }
}



