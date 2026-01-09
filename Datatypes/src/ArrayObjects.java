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

    void display()
    {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class ArrayObjects
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[2];

        employees[0] = new Employee(101, "Anitha", 45000);
        employees[1] = new Employee(102, "Rahul", 50000);

        for(Employee emp : employees)
        {
            emp.display();
        }
    }
}
