import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return name + "(" + department + ", ₹" + salary + ")";
    }
}

public class StreamExampleobject
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anitha", "iT", 75000));
        employees.add(new Employee("Ravi", "HR", 55000));
        employees.add(new Employee("Kiran", "IT", 80000));
        employees.add(new Employee("Meena", "Finance", 60000));
        employees.add(new Employee("Arjun", "IT", 90000));
        employees.add(new Employee("Sneha", "HR", 58000));

        List<Employee> itEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .collect(Collectors.toList());

        System.out.println("IT Department Employees:");
        itEmployees.forEach(System.out::println);

        List<String> highEarners = employees.stream()
                .filter(emp -> emp.getSalary() > 60000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("/nEmployees earning above 60,000:");
        System.out.println(highEarners);

        List<Employee> updateHR = employees.stream()
                .filter(emp->emp.getDepartment().equals("HR"))
                .map(emp -> new Employee(emp.getName(), emp.getDepartment(), emp.getSalary() * 1.10))
                .collect(Collectors.toList());

        System.out.println("\nupdated HR Employees after 10% hike:");
        updateHR.forEach(System.out::println);

        List<Employee> sortedBySalary = employees.stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());

        System.out.println("\nEmployees sortedby salary (High to Low:");
        sortedBySalary.forEach(System.out::println);

        double avgITSalaries = employees.stream()
                .filter(emp-> emp.getDepartment().equals("IT"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage IT Department Salary: ₹" + avgITSalaries);
    }
}