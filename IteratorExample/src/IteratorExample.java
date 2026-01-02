import java.util.*;

class Student
{
    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class IteratorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Lakshmi"));
        list.add(new Student(102, "Anitha"));
        list.add(new Student(103, "Ravi"));

        System.out.println("--- using Iterator with List ---");
        Iterator<Student> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Student s = listIterator.next();
            System.out.println(s);
            if (s.name.equals("Anitha")) {
                listIterator.remove();
            }
        }
        System.out.println("After removal: " + list);

        Set<Student> set = new HashSet<>(list);
        set.add(new Student(104, "Kiran"));

        System.out.println("\n--- using Iterator with set ---");
        Iterator<Student> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());

            Queue<Student> queue = new LinkedList<>();
            queue.add(new Student(105, "Vijay"));
            queue.add(new Student(106, "Teja"));

            System.out.println("\n--- using Iterator with Queue ---");
            Iterator<Student> queueIterator = queue.iterator();
            while (queueIterator.hasNext()) {
                System.out.println(queueIterator.next());
            }

        }

    }
}