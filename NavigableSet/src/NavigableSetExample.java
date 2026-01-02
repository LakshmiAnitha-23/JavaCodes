import java.util.*;

class product implements Comparable<product>
{
    int price;
    String name;

    public product(int price, String name)
    {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(product p)
    {
        return Integer.compare(this.price, p.price);
    }

    @Override
    public String toString()
    {
        return name + " - ₹" + price;
    }
}

public class NavigableSetExample
{
    public static void main(String[] args)
    {
        NavigableSet<product> products = new TreeSet<>();

        products.add(new product(500, "mouse"));
        products.add(new product(1500, "keyboard"));
        products.add(new product(700, "pendrive"));
        products.add(new product(2500, "Monitor"));

        System.out.println("sorted products:");
        for(product p : products)
        {
            System.out.println(p);
        }

        System.out.println("\nLower than ₹1500: " +products.lower(new product(1500, "")));
        System.out.println("Floor of ₹1500: " + products.floor(new product(1500,"")));
        System.out.println("ceiling of ₹1500: " + products.ceiling(new product(1500, "")));
        System.out.println("Higher than ₹1500: " + products.higher(new product(1500, "")));

        System.out.println("\nDescending order:");
        for(product p : products.descendingSet())
        {
            System.out.println(p);
        }
    }
}