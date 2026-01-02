import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id,String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString()
    {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class QueueAndDequeDemo
{
    public static void main(String[] args)
    {
        System.out.println("=== Queue (LinkedList) Example ===");

        Queue<Employee> queue = new LinkedList<>();

        queue.add(new Employee(1, "Anitha", 60000));
        queue.add(new Employee(2, "Kiran", 55000));
        queue.offer(new Employee(3, "Rahul", 58000));

        System.out.println("Queue after Enqueue: " + queue);

        System.out.println("Front Element (peek): " + queue.peek());

        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Queue after Dequeue: " + queue);

        System.out.println("\n=== priorityQueue example (sorted by salary) ===");

        PriorityQueue<Employee> PriorityQueue = new PriorityQueue<>(
                Comparator.comparingDouble(e -> e.salary)
        );

        PriorityQueue.offer(new Employee(1, "Anitha", 60000));
        PriorityQueue.offer(new Employee(2, "Kiran", 55000));
        PriorityQueue.offer(new Employee(3, "Rahul", 58000));

        System.out.println("PriorityQueue (min salary first): " + PriorityQueue);

        while(!PriorityQueue.isEmpty())
        {
           System.out.println("processing Employee: " + PriorityQueue.poll());

           System.out.println("\n=== ArrayDeque Example ===");

           ArrayDeque<Employee> arrayDeque = new ArrayDeque<>();

           arrayDeque.addLast(new Employee(1, "Anitha", 60000));
           arrayDeque.addLast(new Employee(2, "kiran", 55000));

           arrayDeque.addFirst(new Employee(3, "Rahul", 58000));

           System.out.println("ArrayDeque after Enqueue (Front+Rear): " + arrayDeque);

           System.out.println("Front Element: " + arrayDeque.peekFirst());
           System.out.println("Rear Element: " + arrayDeque.peekLast());

           System.out.println("Dequeued from Rear: " + arrayDeque.pollLast());

           System.out.println("ArrayDeque after Dequeue: " + arrayDeque);

           System.out.println("\n=== stack using ArrayDeque (LIFO) ===");

           ArrayDeque<Employee> stackDeque = new ArrayDeque<>();
           stackDeque.push(new Employee(1, "Anitha", 60000));
           stackDeque.push(new Employee(2, "Kiran", 55000));
           stackDeque.push(new Employee(3, "Rahul", 58000));

           System.out.println("stack (Top at end): " + stackDeque);
           System.out.println("popped (LIFO): " + stackDeque.pop());
           System.out.println("stack after pop: " + stackDeque);
        }
    }
}