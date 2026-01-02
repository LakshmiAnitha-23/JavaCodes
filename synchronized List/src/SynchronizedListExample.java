import java.util.*;

class Employee
{
    int id;
    String name;

    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return id + " _ " + name;
    }
}

public class SynchronizedListExample
{
   public static void main(String[] args)
   {
       List<Employee> list = new ArrayList<>();
       list.add(new Employee(101, "Anitha"));
       list.add(new Employee(102, "Ravi"));
       list.add(new Employee(103, "Kiran"));

       List<Employee> syncList = Collections.synchronizedList(list);

       synchronized (syncList)
       {
           for (Employee e : syncList)
           {
               System.out.println(e);
           }
       }

       System.out.println("=== SynchronzedLinkedlistlistExample");
       List<Employee> linkedList = new LinkedList<>();
       linkedList.add(new Employee(201, "Lakshmi"));
       linkedList.add(new Employee(202, "Manoj"));

       List<Employee> syncLinkedList = Collections.synchronizedList(linkedList);

       synchronized (syncLinkedList)
       {
           for(Employee e : syncLinkedList)
           {
               System.out.println(e);
           }
       }

       System.out.println("vector Example");
       Vector<Employee> vector = new Vector<>();
       vector.add(new Employee(301, "sita"));
       vector.add(new Employee(302,"Ramesh"));

       for(Employee e : vector)
       {
           System.out.println(e);
       }

       System.out.println("stackExample");
       Stack<Employee> stack = new Stack<>();
       stack.push(new Employee(401, "Hari"));
       stack.push(new Employee(402, "Divya"));

       while(!stack.isEmpty())
       {
           System.out.println("popped: " + stack.pop());
       }
   }
}

