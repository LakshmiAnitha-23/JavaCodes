interface Greeting
{
    void sayHello();

}

public class FunctionalInterfaceExample1
{
    public static void main (String[]args)
    {
        Greeting greet = () -> System.out.println("hello world");

        greet.sayHello();
    }
}