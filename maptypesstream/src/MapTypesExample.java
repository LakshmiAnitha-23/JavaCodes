import java.util.*;
import java.util.stream.*;

class Employee
{
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString()
    {
        return name + " (" + age + " yrs, ₹" + salary + ")";
    }
}

public class MapTypesExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
                new Employee("Anitha", 23, 45000.50),
                new Employee("Ram",25,52000.75),
                new Employee("Sita", 24, 48000.00)
        );

       List<String> names = employees.stream()
               .map(emp -> emp.name.toUpperCase())
               .collect(Collectors.toList());
       System.out.println("Names (map): " + names);

       double avgAge = employees.stream()
               .mapToInt(emp -> emp.age)
               .average()
               .orElse(0);
       System.out.println("Average Age (mapToInt): " + avgAge);

       long totalSalaryRounded = employees.stream()
               .mapToLong(emp -> (long) emp.salary)
               .sum();
       System.out.println("Total salary (mapToLong): ₹" + totalSalaryRounded);

       double maxSalary = employees.stream()
               .mapToDouble(emp -> emp.salary)
               .max()
               .orElse(0.0);
       System.out.println("max salary (mapToDouble): ₹" +maxSalary);

       List<List<String>> empSkills = List.of(
               List.of("Java", "Spring Boot"),
               List.of("Python", "SQL"),
               List.of("HTML", "CSS", "JavaScript")
       );

       List<String> allSkills = empSkills.stream()
               .flatMap(List::stream)
               .collect(Collectors.toList());
       System.out.println("All skills (flatMap): " + allSkills);

    }
}