import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString()
    {
        return name + " - ₹" + salary;
    }
}

public class DottingObjects
{
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
                new Employee("Anitha", 75000),
                new Employee("Ravi", 60000),
                new Employee("Meena", 50000)
        );

        List<String> names = employees.stream()
                .filter(e -> e.getSalary() > 55000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(names);
    }
}