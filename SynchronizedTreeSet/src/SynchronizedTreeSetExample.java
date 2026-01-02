import java.util.*;

class Employee implements Comparable<Employee>
{
    int id;
    String name;

    Employee(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Employee e)
    {
        return this.id - e.id;
    }
        public String toString()
        {
            return id + " _ " + name;
        }
}

public class SynchronizedTreeSetExample
{
    public static void main(String[] args)
    {
        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee(701, "Nisha"));
        treeSet.add(new Employee(702, "Varun"));

        Set<Employee> syncTreeSet = Collections.synchronizedSet(treeSet);

        synchronized(syncTreeSet)
        {
            for (Employee e : syncTreeSet)
            {
                System.out.println(e);
            }
        }
    }
}