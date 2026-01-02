import java.io.*;

class Student implements Serializable
{
    String name;
    int age;
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class ObjectStreamExample
{
    public static void main(String[] args)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser")))
        {
            Student s1 = new Student("Anitha", 22);
            oos.writeObject(s1);
            System.out.println("object serialized successfully.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser")))
        {
            Student s2= (Student) ois.readObject();
            System.out.println("Deserialzed student : " + s2.name + ", " + s2.age);

        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}