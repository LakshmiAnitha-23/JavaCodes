class Vehicle
{
    protected String name;
    public Vehicle(String name)
    {
        this.name=name;
        System.out.println("vehicle constructor");

    }
    public void start()
    {
        System.out.println("vehicle starting");}
    }

    class car extends Vehicle
    {

        public car(String name) {
            super(name);
            System.out.println("car constructor");
        }

        @Override
        public void start() {
            super.start();
            System.out.println("car specific start");
        }
    }

    public class InheritanceDemo
    {
        public static void main(String[] args){
            Vehicle v = new car("Honda");
            v.start();

    }
    }
