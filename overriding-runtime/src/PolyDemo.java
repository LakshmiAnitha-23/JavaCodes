class Animal {
    void speak() { System.out.println("Animal speaks"); }
}
class Dog extends Animal {
    @Override void speak() { System.out.println("Woof"); }
    void wagTail() { System.out.println("Wagging"); }
}

public class PolyDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();             // prints "Woof" -> runtime type Dog
        // a.wagTail();        // compile error: Animal reference doesn't have wagTail
        if (a instanceof Dog) {
            ((Dog) a).wagTail(); // safe downcast to access subclass methods
        }
    }
}
