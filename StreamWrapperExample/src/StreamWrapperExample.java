import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public double getSalary() { return salary; }
    public String getName() { return name; }
}

public class StreamWrapperExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anitha", 75000));
        employees.add(new Employee("Ravi",60000));
        employees.add(new Employee("Meena", 50000));

        List<String> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highEarners);
    }
}