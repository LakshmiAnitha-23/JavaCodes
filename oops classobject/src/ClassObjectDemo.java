public class ClassObjectDemo
{
    static { System.out.println("static block runs when class loads "); }
    { System.out.println("instance initializer runs each time before constructor"); }
    private String name;

    public ClassObjectDemo()
    {
        System.out.println("constructor");
        this.name = "default";
    }

    public ClassObjectDemo(String name)
    {
        this();
        this.name=name;
        System.out.println("parameterized constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("main start");
        ClassObjectDemo a = new ClassObjectDemo("Alice");
        ClassObjectDemo b = new ClassObjectDemo("Bob");
        System.out.println("main end");
    }
}