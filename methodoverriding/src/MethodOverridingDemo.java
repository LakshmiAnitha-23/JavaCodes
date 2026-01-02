class Vehicle
{
    String brand;

    Vehicle(String brand)
    {
        this.brand = brand;
    }

    void start()
    {
        System.out.println("vehicle is strting");
    }

    void stop()
    {
        System.out.println("vehice is stopping");
    }
}

class Car extends Vehicle{
    int doors;

    Car(String brand, int doors)
    {
        super(brand);
        this.doors = doors;
    }

    @Override
    void start()
    {
        System.out.println("car "  + brand + " with " + doors + "doors is starting using a key.");
    }

    @Override
    void stop()
    {
        System.out.println("car " + brand + " is stopping by pressing brake.");
    }
}

class Bike extends Vehicle {
    boolean hasHelmet;

    Bike(String brand, boolean hasHelmet) {
        super(brand);
        this.hasHelmet = hasHelmet;
    }

    @Override
    void start() {
        if (hasHelmet) {
            System.out.println("Bike " + brand + "is starting using handbrakes.");

        } else {
            System.out.println("Bike " + brand + " is starting without helmet (Not safe).");
        }
    }

    @Override
    void stop() {
        System.out.println("Bike " + brand + " is stopping hand brakes.");
    }
}

    class Truck extends Vehicle{
        int loadCapacity;

        Truck(String brand, int loadCapacity)
        {
            super(brand);
            this.loadCapacity = loadCapacity;
        }

        @Override
        void start()
        {
            System.out.println("Truck " + brand + " is starting with heavy engine sound.");
        }

        @Override
        void stop()
        {
            System.out.println("Truck " + brand + " with capacity " + loadCapacity + "kg is stopping with air brakes.");
        }
    }

    public class MethodOverridingDemo
    {
        public static void main(String[] args) {


            Vehicle v1 = new Car("Toyota", 4);
            Vehicle v2 = new Bike("yamaha", true);
            Vehicle v3 = new Bike("Honda", false);
            Vehicle v4 = new Truck("volvo", 15000);

            v1.start();
            v1.stop();

            v2.start();
            v2.stop();

            v3.start();
            v3.stop();

            v4.start();
            v4.stop();
        }
    }


