import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface BonusCalculator
{
    double calculate(double salary);
}

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

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString()
    {
        return name + " (" + department + ") -₹" + salary;
    }
}

public class FunctionalInterfaceExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
              new Employee("Anitha","IT", 70000),
                new Employee("Rahul","Finance", 60000),
                new Employee("Divya","HR", 50000),
                new Employee("Sai","IT",90000),
                new Employee("Kiran", "Marketing",45000)

        );

        BonusCalculator bonusCalc = salary -> salary * 0.10;
        Predicate<Employee> isITDept = emp -> emp.getDepartment().equalsIgnoreCase("IT");
        Function<Employee, Double> totalsalary = emp -> emp.getSalary();
                Consumer<Employee> displayEmp = emp ->
                        System.out.println(emp.getName() + " - Dept: " + emp.getDepartment()+
                                " | Base Salary: ₹" + emp.getSalary() +
                                " |  Total Salary:  ₹" + totalsalary.apply(emp));

        System.out.println("iT department employee bonus details");
        employees.stream()
                .filter(isITDept)
                .forEach(displayEmp);

        Supplier<Integer> empIdSupplier = () -> new Random().nextInt(1000) + 100;
        System.out.println("\n Example of supplier:");
        System.out.println("Generated employee ID: " + empIdSupplier.get() );


        BiFunction<String, String, String> fullDetail = (name, dept)->
                "Employee: " + name + " | Department: " + dept;

        System.out.println("\n using BiFunction:");
        System.out.println(fullDetail.apply("Anitha", "IT"));



    }
}