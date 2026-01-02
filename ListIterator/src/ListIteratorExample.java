import java.util.*;

class student
{
    int id;
    String name;

    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ListIteratorExample
{
    public static void main(String[] args)
    {
        List<student> list = new ArrayList<>();
        list.add(new student(1, "Lakshmi"));
        list.add(new student(2, "Anitha"));
        list.add(new student(3, "Ravi"));

        System.out.println("Original List: " + list);

        ListIterator<student> itr = list.listIterator();

        System.out.println("\n--- Forward Traversal ---");
        while (itr.hasNext())
        {
            student s = itr.next();
            System.out.println("Next: " + s + " | NextIndex: " + itr.nextIndex());

            if(s.name.equals("Anitha"))
            {
                itr.set(new student(2, "Anitha Bonthu"));
            }
            if (s.name.equals("Ravi"))
            {
                itr.add(new student(4, "Teja"));
            }
        }
        System.out.println("\nAfter modifications: " + list);

        System.out.println("\n-- Backward Traversal ---");
        while (itr.hasPrevious())
        {
            student s = itr.previous();
            System.out.println("previous: " + s + " | prevIndex: " + itr.previousIndex());
        }

        System.out.println("\nFinal List: " + list);
    }
}