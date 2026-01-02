interface CanRun
{
    void run();
}

interface CanSwim
{
    void swim();
}

class Amphibian implements CanRun, CanSwim
{
    @Override
    public void run() {
        System.out.println("Amphibian runs on land");
    }

    public void swim()
    {
        System.out.println("Amphibian swims in water");
    }
}

public class MultiInheritanceDemo
{
    public static void main(String[] args)
    {
        Amphibian a = new Amphibian();
        a.run();
        a.swim();
    }
}