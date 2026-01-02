import java.util.*;
import java.util.concurrent.*;

class Employee
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
    public String toString()
    {
        return id + " - " + name + "(₹" + salary + ")";

    }
}

public class MapExampleAll1
{
    public static void main(String[] args)
    {

        System.out.println("=== HashMap Example ===");
        Map<Integer, Employee> hashMap = new HashMap<>();

        hashMap.put(101, new Employee(101, "Lakshmi", 55000));
        hashMap.put(102, new Employee(102, "Ravi", 60000));
        hashMap.put(103, new Employee(103, "sneha", 50000));
        hashMap.put(102, new Employee(102, "Ravi Updated", 65000));

        for (Map.Entry<Integer, Employee> entry : hashMap.entrySet())
        {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
        System.out.println("Hashmap allows null keys and values \n");

        System.out.println("=== LinkedHashMap Example ===");
        Map<Integer, Employee> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(201, new Employee(201, "Arjun", 58000));
        linkedHashMap.put(202, new Employee(202, "Divya", 62000));
        linkedHashMap.put(203, new Employee(203, "manoj", 54000));
        linkedHashMap.put(null, new Employee(204,"sita", 70000));

        linkedHashMap.forEach((k,v) -> System.out.println("key: " + k + ", Value: " + v));
        System.out.println(("Insertion order maintained \n"));

        System.out.println("=== TreeMap Example (sorted by key) ===");
        Map<Integer, Employee> treeMap = new TreeMap<>();

        treeMap.put(301, new Employee(301, "Ramesh", 60000));
        treeMap.put(304, new Employee(304, "pooja", 61000));
        treeMap.put(302, new Employee(302, "Geeta", 58000));
        treeMap.put(303, new Employee(303, "suresh", 62000));

        for(Map.Entry<Integer, Employee> entry : treeMap.entrySet())
        {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
        System.out.println("sorted automatically by key (natural order");

        System.out.println("=== TreeMap Example (custom comparator: Descending order) ===");
        Map<Integer, Employee> treeMapDesc = new TreeMap<>(Comparator.reverseOrder());

        treeMapDesc.put(401,new Employee(401, "Meena", 57000));
        treeMapDesc.put(402, new Employee(402,"Rohit",63000));
        treeMapDesc.put(403, new Employee(403,"Anil", 51000));

        treeMapDesc.forEach((k,v) -> System.out.println("key: " +k + ", Value: " + v));
        System.out.println("sorted in descending order of keys \n");

        System.out.println("=== Hashtable Example ===");
        Map<Integer, Employee> hashtable = new Hashtable<>();

        hashtable.put(501,new Employee(501,"kavya", 59000));
        hashtable.put(502, new Employee(502, "Naveen", 62000));
        hashtable.put(503, new Employee(503, "Lalitha", 65000));

        for(Integer key : hashtable.keySet())
        {
            System.out.println("key: " + key + ", value: " + hashtable.get(key));
        }
        System.out.println("thread-safe, but slower performance \n");

        System.out.println("=== concurrentHashMap Example ===");
        Map<Integer, Employee> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put(601, new Employee(601, "chandu", 89000));
        concurrentMap.put(602, new Employee(602, "Teja", 59000));
        concurrentMap.put(603, new Employee(603, "varun", 68000));

        concurrentMap.forEach((k,v) -> new Employee(v.id, v.name, v.salary + 5000));
        System.out.println("After Salary update(602): " + concurrentMap.get(602));
        System.out.println("Thread-Safe, non-blocking operations");

    }
}