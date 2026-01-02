import java.util.*;
class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other)
    {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString()
    {
       return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class TreeSetExample
{
    public static void main(String[] args)
    {
        System.out.println("=== TreeSet (Natural Order by Id) ===");

        TreeSet<Employee> treeSetByID = new TreeSet<>();
        treeSetByID.add(new Employee(3, "Rahul", 55000));
        treeSetByID.add(new Employee(1, "Anitha", 60000));
        treeSetByID.add(new Employee(2, "Kiran",58000));
        treeSetByID.add(new Employee(2, "kiran Dulicate", 58000));

        for (Employee e : treeSetByID)
            System.out.println(e);

        System.out.println("\n=== TreeSet (custom order by Name) ===");

        TreeSet<Employee> treeSetByName = new TreeSet<>(Comparator.comparing(e -> e.name));
        treeSetByName.add(new Employee(1, "Anitha", 60000));
        treeSetByName.add(new Employee(3, "Rahul", 58000));
        treeSetByName.add(new Employee(2, "kiran", 58000));
        treeSetByName.add(new Employee(4, "Divya", 62000));

        for (Employee e : treeSetByName)
            System.out.println(e);

        System.out.println("\n=== TreeSet (custom order by salary Ascending) ===");

        TreeSet<Employee> treeSetBySalary = new TreeSet<>(Comparator.comparingDouble(e -> e.salary));

        treeSetBySalary.add(new Employee(1, "Anitha",60000));
        treeSetBySalary.add(new Employee(2, "Rahul",55000));
        treeSetBySalary.add(new Employee(3, "Kiran", 58000));
        treeSetBySalary.add(new Employee(4, "Divya", 62000));

        for (Employee e : treeSetBySalary)
            System.out.println(e);

        System.out.println("\n=== TreeSe (salary Descending Order) ===");

        TreeSet<Employee> treeSetSalaryDesc = new TreeSet<>(
                (e1,e2) ->Double.compare(e2.salary, e1.salary)
        );

        treeSetSalaryDesc.addAll(treeSetBySalary);
        for (Employee e : treeSetSalaryDesc)
            System.out.println(e);

       System.out.println("\n=== TreeSet Utility Methods Example (By ID) ===");

       System.out.println("Full TreeSet: " + treeSetByID);

       System.out.println("First: " + treeSetByID.first());
       System.out.println("Last: " + treeSetByID.last());

       Employee limitEmp = new Employee(3, "Dummy", 0);
       System.out.println("HeadSet (ID < 3): " + treeSetByID.headSet(limitEmp));

       System.out.println("TailSet  (ID >= 2): " + treeSetByID.tailSet(new Employee(2, "Dummy", 0)));

       System.out.println("SubSet (ID between 1 and 3): " +
               treeSetByID.subSet(new Employee(1, "Dummy", 0), new Employee(3, "Dummy", 0)));

       System.out.println("\n=== TreeSet (Comparator chaining: Salary, then Name) ===");

       Comparator<Employee> salaryThenNameComparator =
               Comparator.comparingDouble((Employee e) -> e.salary)
                       .thenComparing(e -> e.name);

       TreeSet<Employee> treeSetChained = new TreeSet<>(salaryThenNameComparator);
       treeSetChained.add(new Employee(3, "Rahul", 55000));
       treeSetChained.add(new Employee(1, "Anitha", 60000));
       treeSetChained.add(new Employee(2, "Kiran", 60000));
       treeSetChained.add(new Employee(4, "Divya",55000));

       for (Employee e : treeSetChained)
           System.out.println(e);
    }
}