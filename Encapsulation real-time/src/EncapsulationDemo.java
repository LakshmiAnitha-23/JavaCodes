class BankAccount
{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount!");

        }
    }

    public void withdraw(double amount)
    {
        if(amount>0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
        else {
            System.out.println("Invalid withdrawl!!");
        }
    }

}

public class EncapsulationDemo
{
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount("Alice", 5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(8000);
    }
}