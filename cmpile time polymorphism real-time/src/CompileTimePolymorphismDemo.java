class Calculator
{
    int add(int a, int b)
    {
        return a+b;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }
}

public class CompileTimePolymorphismDemo
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println("sum (int): " + calc.add(5,15));
        System.out.println("sum (double): " + calc.add(5.5, 10.2));
        System.out.println("sum (3 ints): " + calc.add(2,3,2));
    }
}