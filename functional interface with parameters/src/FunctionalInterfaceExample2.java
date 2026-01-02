interface Calculator
{
    int add(int a, int b);

}

public class FunctionalInterfaceExample2
{
    public static void main (String[] args)
    {
        Calculator sum = (a,b) -> a+b;

        System.out.println("sum: " +sum.add(5,10));
    }
}