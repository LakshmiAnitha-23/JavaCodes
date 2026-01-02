import java.util.*;
import java.util.concurrent.*;

// Custom Object Class
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " (₹" + salary + ")";
    }
}

public class QueueExampleAll {
    public static void main(String[] args) {

        // ---------------- 1️⃣ LinkedList as Queue ----------------
        System.out.println("=== LinkedList Queue Example ===");
        Queue<Employee> linkedListQueue = new LinkedList<>();

        linkedListQueue.offer(new Employee(101, "Lakshmi", 55000)); // enqueue
        linkedListQueue.offer(new Employee(102, "Ravi", 60000));
        linkedListQueue.offer(new Employee(103, "Sneha", 50000));

        System.out.println("Queue Elements: " + linkedListQueue);
        System.out.println("Peek (Front): " + linkedListQueue.peek());
        System.out.println("Poll (Dequeue): " + linkedListQueue.poll());
        System.out.println("After Poll: " + linkedListQueue);
        System.out.println();


        // ---------------- 2️⃣ PriorityQueue ----------------
        System.out.println("=== PriorityQueue Example (Ordered by Salary) ===");
        Queue<Employee> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(emp -> emp.salary));

        priorityQueue.offer(new Employee(201, "Arjun", 58000));
        priorityQueue.offer(new Employee(202, "Divya", 62000));
        priorityQueue.offer(new Employee(203, "Manoj", 54000));
        priorityQueue.offer(new Employee(204, "Sita", 70000));

        System.out.println("Polling in Salary Order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println();


        // ---------------- 3️⃣ ArrayDeque (Double Ended Queue) ----------------
        System.out.println("=== ArrayDeque Example ===");
        Deque<Employee> arrayDeque = new ArrayDeque<>();

        // Add elements at both ends
        arrayDeque.addFirst(new Employee(301, "Ramesh", 60000));
        arrayDeque.addLast(new Employee(302, "Geeta", 58000));
        arrayDeque.offerLast(new Employee(303, "Suresh", 62000));
        arrayDeque.offerFirst(new Employee(304, "Pooja", 61000));

        System.out.println("Deque Elements: " + arrayDeque);
        System.out.println("Peek First: " + arrayDeque.peekFirst());
        System.out.println("Peek Last: " + arrayDeque.peekLast());

        // Remove elements
        arrayDeque.pollFirst(); // Removes first
        arrayDeque.pollLast();  // Removes last
        System.out.println("After Polls: " + arrayDeque);
        System.out.println();


        // ---------------- 4️⃣ ConcurrentLinkedQueue ----------------
        System.out.println("=== ConcurrentLinkedQueue Example ===");
        Queue<Employee> concurrentQueue = new ConcurrentLinkedQueue<>();

        concurrentQueue.offer(new Employee(401, "Meena", 57000));
        concurrentQueue.offer(new Employee(402, "Rohit", 63000));
        concurrentQueue.offer(new Employee(403, "Anil", 51000));

        System.out.println("Concurrent Queue: " + concurrentQueue);
        System.out.println("Peek: " + concurrentQueue.peek());
        System.out.println("Poll: " + concurrentQueue.poll());
        System.out.println("After Poll: " + concurrentQueue);
    }
}
