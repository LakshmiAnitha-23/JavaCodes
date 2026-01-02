import java.util.*;

class Employee
{
    String name;
    double salary;
    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

public class LambdaAnonymous{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anitha", 60000),
                new Employee("Ravi", 50000),
                new Employee("Sita", 70000)
        );

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        employees.forEach(e -> System.out.println(e.name + " - " + e.salary));
    }
}
