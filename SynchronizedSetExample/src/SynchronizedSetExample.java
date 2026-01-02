import java.util.*;
class Employee
{
    int id;
    String name;

    Employee(int id, String name)
    {
        this.id= id;
        this.name= name;
    }

    public String toString()
    {
        return id + " _ " + name;
    }
}

public class SynchronizedSetExample {
    public static void main(String[] args)
    {
        System.out.println("=====HashSet Example=====");
        Set<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee(501, "Asha"));
        hashSet.add(new Employee(502,"Ravi"));

        Set<Employee> syncSet = Collections.synchronizedSet(hashSet);

        synchronized (syncSet)
        {
            for(Employee e : syncSet)
            {
                System.out.println(e);
            }
        }

        System.out.println("====LinkedHashSetExample====");
        Set<Employee> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Employee(601, "Teja"));
        linkedHashSet.add(new Employee(602, "Kavya"));

        Set<Employee> syncLinkedHashSet = Collections.synchronizedSet(linkedHashSet);

        synchronized (syncLinkedHashSet)
        {
            for(Employee e : syncLinkedHashSet)
            {
                System.out.println(e);
            }
        }
    }
}