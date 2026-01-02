import java.util.*;

class Employee implements Comparable<Employee>
{
    int id;
    String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
       return Integer.compare(this.id, e.id);
    }

    @Override
    public String toString()
    {
        return id + " _ " + name;
    }
}

public class RedBlackTreeExample
{
    public static void main(String[] args)
    {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee(103, "Ravi"));
        employees.add(new Employee(101, "Lakshmi"));
        employees.add(new Employee(105, "Anitha"));
        employees.add(new Employee(102, "Kumar"));

        System.out.println("Employees in sorted order (Red-Black Tree):");
        for (Employee e : employees)
        {
            System.out.println(e);
        }

        System.out.println("\nFirst Employee: " + employees.first());
        System.out.println("Last Employee: " + employees.last());
        System.out.println("Lower than ID 103: " + employees.lower(new Employee(103, "")));
        System.out.println("Higher than ID 103: " + employees.higher(new Employee(103, "")));
    }
}

