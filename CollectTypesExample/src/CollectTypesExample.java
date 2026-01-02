import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee
{
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
        public String toString()
        {
            return name + "(" + department + ", ₹" + salary + ")";

        }
    }

    public class CollectTypesExample
    {
        public static void main(String[] args)
        {
            List<Employee> employees = List.of(
                    new Employee("Anitha", "IT", 50000),
                    new Employee("Ram", "HR", 45000),
                    new Employee("Sita", "IT", 55000),
                    new Employee("Ravi","Finance", 60000),
                    new Employee("Kiran", "HR", 47000)
            );

            List<String> names = employees.stream()
                    .map(emp -> emp.name)
                    .collect(Collectors.toList());
            System.out.println("Names List: " + names);

            Set<String> departments = employees.stream()
                    .map(emp -> emp.department)
                    .collect(Collectors.toSet());
            System.out.println("Unique Departments Set: " + departments);

            Map<String, Double> salaryMap = employees.stream()
                    .collect(Collectors.toMap(emp -> emp.name, emp->emp.salary));
           System.out.println("Name-Salary Map: " + salaryMap);

           String joinedNames = employees.stream()
                   .map(emp -> emp.name)
                   .collect(Collectors.joining(", ", "[", "]"));
           System.out.println("Joined Names: " + joinedNames);

           long count = employees.stream()
                   .collect(Collectors.counting());
           System.out.println("Total Employees: " + count);

           double avgSalary = employees.stream()
                   .collect(Collectors.averagingDouble(emp -> emp.salary));
           System.out.println("Average Salary:  ₹" + avgSalary);

           double totalSalary = employees.stream()
                   .collect(Collectors.summingDouble(emp -> emp.salary));
           System.out.println("Total salary: ₹" + totalSalary);

           Map<String, List<Employee>> groupByDept = employees.stream()
                   .collect(Collectors.groupingBy(emp -> emp.department));
           System.out.println("Grouped by Department: " + groupByDept);

           Map<Boolean, List<Employee>> partitionBySalary = employees.stream()
                   .collect(Collectors.partitioningBy(emp -> emp.salary > 50000));
           System.out.println("Partitioned by salary > 50000: " + partitionBySalary);

          DoubleSummaryStatistics stats = employees.stream()
                  .collect(Collectors.summarizingDouble(emp -> emp.salary));
          System.out.println("salary summary: " + stats);
        }
    }

