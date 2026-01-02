interface Animal
{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound()
    {
        System.out.println("woof woof");
    }
}

public class InterfaceDemo
{
   public static void main(String[] args)
   {
       Animal a = new Dog();
       a.sound();
   }
}