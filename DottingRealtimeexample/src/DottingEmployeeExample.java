import java.util.*;
import java.util.stream.*;

class Employee
{
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department;}
    public double getSalary() { return salary; }

}

public class DottingEmployeeExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
                new Employee("Anitha", "IT",75000),
                new Employee("Ravi", "HR", 55000),
                new Employee("Meena", "IT", 65000),
                new Employee("Kiran", "Finance",50000),
                new Employee("Arjun", "IT", 90000)
        );

        List<String> result = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("High-salary IT employees: " + result);
    }
}
