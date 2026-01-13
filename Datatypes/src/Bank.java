public class Bank
{
    static  int currentBalance = 2000;
    public static void greetCustomer()
    {
        System.out.println("Hello Madam welcome to our Bank");
    }

    public void deposit(int amount)
    {
        currentBalance = currentBalance + amount;
        System.out.println("deposit amount: " + amount);
        System.out.println("After Deposited amount: " + currentBalance);
    }

    public static void withdraw(int amount)
    {
        currentBalance = currentBalance - amount;
        System.out.println("withdraw amount: " + amount);
        System.out.println("After withdraw amount: " + currentBalance);
    }

    public static void main(String[] args)
    {
        greetCustomer();
        Bank bank = new Bank();
        bank.deposit(500);
        withdraw(2000);
    }
}