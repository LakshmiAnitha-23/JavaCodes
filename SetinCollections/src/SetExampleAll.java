import java.util.*;

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;

    Employee(int id,String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return id == e.id && name.equals(e.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,name);
    }

    @Override
    public int compareTo(Employee e)
    {
        return Integer.compare(this.id, e.id);
    }

    public String toString()
    {
        return id + " - " + name + " (₹" + salary + ")";
    }
}
public class SetExampleAll
{
    public static void main(String[] args)
    {
        System.out.println("=== HashSet Example ===");
        Set<Employee> hashSet = new HashSet<>();

        hashSet.add(new Employee(101, "Lakshmi", 55000));
        hashSet.add(new Employee(102, "Ravi", 60000));
        hashSet.add(new Employee(103, "sneha", 50000));
        hashSet.add(new Employee(101, "Lakshmi", 55000));

        for (Employee e : hashSet)
        {
            System.out.println(e);
        }
        System.out.println("contains sneha? " + hashSet.contains(new Employee(103, "sneha", 50000)));
        System.out.println();

        System.out.println("=== LinkedHahSet Example ===");
        Set<Employee> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new Employee(201,"Arjun", 58000));
        linkedHashSet.add(new Employee(202, "Divya", 62000));
        linkedHashSet.add(new Employee(203, "Manoj", 54000));
        linkedHashSet.add(new Employee(201, "Arjun", 58000));

        for(Employee e : linkedHashSet)
        {
            System.out.println(e);
        }

        System.out.println("Insertion order maintained");
        System.out.println();

        System.out.println("=== TreeSet Example (Natural order by ID ===");
        Set<Employee> treeSet = new TreeSet<>();

        treeSet.add(new Employee(301,"Ramesh", 60000));
        treeSet.add(new Employee(304, "pooja", 61000));
        treeSet.add(new Employee(302, "Geeta", 58000));
        treeSet.add(new Employee(303,"suresh", 62000));

        for (Employee e : treeSet)
        {
            System.out.println(e);
        }
        System.out.println("sorted automatically by ID (comparable)");
        System.out.println();

        System.out.println("=== Treeset Example (custom comparator by salary ===");
        Set<Employee> treeSetBySalary = new TreeSet<>(Comparator.comparingDouble(emp -> emp.salary));

        treeSetBySalary.add(new Employee(401, "Meena", 57000));
        treeSetBySalary.add(new Employee(402, "Rohit", 63000));
        treeSetBySalary.add(new Employee(403, "Anil", 51000));
        treeSetBySalary.add(new Employee(404, "chandu", 64000));

        for (Employee e : treeSetBySalary)
        {
            System.out.println(e);
        }
        System.out.println("sorted by salary");
        System.out.println();

        System.out.println("=== Treeset Example (Custom comparator by Name) ===");
        Set<Employee> treeSetByName = new TreeSet<>(Comparator.comparing(emp -> emp.name));

        treeSetByName.add(new Employee(501, "Kavya", 59000));
        treeSetByName.add(new Employee(502, "Naveen", 62000));
        treeSetByName.add(new Employee(503, "lalitha", 65000));
        treeSetByName.add(new Employee(504, "Anil", 64000));

        for (Employee e : treeSetByName)
        {
            System.out.println(e);
        }
        System.out.println("sorted by name");
    }
}