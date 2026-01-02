import java.util.*;
import java.util.stream.*;

class Employee
{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString()
    {
        return id + " - " + name + "(" + department + ") : ₹" + salary;


    }
}

public class LambdaExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Anitha", "HR", 50000),
                new Employee(102, "Rahul", "IT", 75000),
                new Employee(103, "Divya", "Finance", 60000),
                new Employee(104, "Sai", "IT", 90000),
                new Employee(105, "Kiran", "Marketing", 50000)
        );

        System.out.println("All Employees:");
        employees.forEach(emp -> System.out.println(emp));

        System.out.println("\nEmployeesin IT department:");
        employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .forEach(emp -> System.out.println(emp));

        System.out.println("\nEmployees with salary > 60000:");
        employees.stream()
                .filter(emp -> emp.getSalary() > 60000)
                .forEach(emp -> System.out.println(emp));

        System.out.println("\nEmployees sorted by salary:");
        employees.stream()
                .sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);

        System.out.println("\nAfter 10% salary hike:");
        employees.stream()
                .map(emp-> new Employee(
                        emp.getId(),
                        emp.getName(),
                        emp.getDepartment(),
                        emp.getSalary()* 1.10))
                .forEach(System.out::println);

        System.out.println("\nEmployee names in uppercase:");
        employees.stream()
                .map(emp -> emp.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nHighest paid Employee:");
        employees.stream()
                .max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .ifPresent(System.out::println);

    }
}