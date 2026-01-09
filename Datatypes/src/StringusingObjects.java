class Student
{
    String name;
    String email;

    Student(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    void display()
    {
        System.out.println(name + "-" + email);
    }
}


public class StringusingObjects
{
    public static void main(String[] args)
    {
        Student s = new Student("Anitha", "anitha@gmail.com");
        s.display();
    }
}
