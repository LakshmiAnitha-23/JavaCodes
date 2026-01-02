class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
       this.id = id;
       this.name=name;
       this.salary=salary;
    }

    public String toString()
    {
        return id + " _ " + name + "(₹" + salary +")";
    }
}

public class ListExampleAll
{
    public static void main(String[] args)
    {
        System.out.println("===Arraylist Example===");
        List<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(101, "Lakshmi", 55000));
        arrayList.add(new Employee(102,"Ravi", 60000));
        arrayList.add(new Employee(103, "Sneha", 50000));

        arrayList.add(1, new Employee(104, "kiran", 65000));
        arrayList.remove(2);

        for (Employee e : arrayList)
        {
            System.out.println(e);
        }

        arrayList.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("sorted by salary (ArrayList): " + arrayList);
        System.out.println();

        System.out.println("=== LinkedList Example ====");
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(new Employee(201, "Arjun", 58000));
        linkedList.addFirst(new Employee(202, "Divya", 62000));
        linkedList.addLast(new Employee(203, "Manoj",  54000));

        linkedList.removeFirst();
        linkedList.add(new Employee(204, "sita", 70000));

        for (Employee e : linkedList)
        {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("=== Vector Example ===");
        Vector<Employee> vector = new Vector<>();
        vector.add(new Employee(301, "Ramesh", 60000));
        vector.add(new Employee(302, "Geeta", 58000));
        vector.add(new Employee(303, "suresh", 62000));

        vector.removeIf(emp -> emp.salary < 60000);
        vector.addElement(new Employee(304, "pooja", 61000));

        Enumeration<Employee> en = vector.elements();
        while (en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
        System.out.println();

        System.out.println("=== Stack Example ===");
        Stack<Employee> stack = new Stack<>();
        stack.push(new Employee(401, "Meena", 57000));
        stack.push(new Employee(402, "Rohit", 63000));
        stack.push(new Employee(403, "Anil", 51000));

        System.out.println("Top Element: " + stack.peek());
        stack.pop();
        System.out.println("After pop: " + stack);
        System.out.println();

        System.out.println("=== Arrays.asList() Example ===");
        List<Employee> fixedList = Arrays.asList(
                new Employee(501, "kavya", 59000),
                new Employee(502, "Naveen", 43500),
                new Employee(503, "Lalitha", 65000)
        );

        for (Employee e : fixedList)
        {
            System.out.println(e);
        }

        List<Employee> modifiable = new ArrayList<>(fixedList);
        modifiable.add(new Employee(504, "chandu", 64000));
        System.out.println("After adding new employee: " + modifiable);



    }
}


