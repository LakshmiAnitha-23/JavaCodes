public class BankAccount
{
    private double balance;

    public BankAccount(double initial)
    {
        if(initial < 0) throw new IllegalArgumentException("Intial >= 0");
        this.balance = initial;
    }

    public synchronized void deposit(double amt)
    {
        if(amt <= 0) throw new IllegalArgumentException("amt > 0");
        balance += amt;
    }


    public synchronized void withdraw(double amt)
    {
       if(amt <= 0 || amt > balance) throw new IllegalArgumentException("invaild amount");
       balance -= amt;
    }

    public synchronized double getBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("After withdraw: " + acc.getBalance());
    }

}
