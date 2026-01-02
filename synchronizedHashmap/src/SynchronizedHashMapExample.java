import java.util.*;
class Employee
{
    int id;
    String name;
    String department;

    Employee(int id, String name, String department)
    {
        this.id=id;
        this.name=name;
        this.department=department;
    }

    @Override
    public String toString()
    {
      return "Employee(" + "id=" + id + ", name='" + name + '\'' + " ,  dept='" + department + '\'' + '}' ;
            }
}

public class SynchronizedHashMapExample
{
    public static void main(String[] args)
    {
        Map<Integer,Employee> syncMap = Collections.synchronizedMap(new HashMap<>());

        syncMap.put(1, new Employee(1, "Alice", "HR"));
        syncMap.put(2, new Employee(2, "Bob", "IT"));
        syncMap.put(3, new Employee(3, "Charlie", "Finance"));

        synchronized (syncMap)
        {
            for(Map.Entry<Integer, Employee> entry : syncMap.entrySet())
            {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
