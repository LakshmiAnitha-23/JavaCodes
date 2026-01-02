public interface payment
{
    void pay(double amount);
    default void log(String s)
    {
        System.out.println("LOG: " + s);
    }
}

class Cardpayment implements payment{
    public void pay(double amount)
    {
        log("card paid " + amount);
    }
}

