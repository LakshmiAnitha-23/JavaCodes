interface printer
{
    void print();
}

interface Scanner
{
    void scan();
}

class MultiFunctionPrinter implements printer, Scanner{

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class MultiFunctionprinterDemo
{
    public static void main(String[] args)
    {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
       mfp. print();
       mfp.scan();
    }
}