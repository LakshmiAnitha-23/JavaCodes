class Animal
{
    void eat()
    {
        System.out.println("Animaleats food");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class cat extends Animal{
    void meow()
    {
        System.out.println("cat meows");
    }
}

public class InheritanceDemo
{
    public static void main (String[] args)
    {
       Dog d = new Dog();
       d.eat();
       d.bark();

       cat c = new cat();
       c.eat();
       c.meow();
    }
}