import java.io.*;
import java.util.*;

class person
{
    private String name;
    private Integer age;

    public person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public Integer getAge() { return age; }
    public String getName() { return name; }

    static class ComparisonProvider
    {
        public int compareByName(person a, person b){
            return a.getName().compareTo(b.getName());
        }

        public int compareByAge(person a, person b)
        {
            return a.getAge().compareTo(b.getAge());
        }

        public class Geeks
        {
            public static void main(String[] args)
            {
                List<person> personList = new ArrayList<>();

                personList.add(new person("vicky", 24));
                personList.add(new person("poonam", 25));
                personList.add(new person("Sachin", 19));

                ComparisonProvider comparator = new ComparisonProvider();

                Collections.sort(personList, comparator::compareByName);
                System.out.println("sort by name :");

                personList.stream()
                        .map(x -> x.getName())
                        .forEach(System.out::println);

                System.out.println();

                Collections.sort(personList, comparator::compareByAge);

                System.out.println("sort by age :");

                personList.stream()
                        .map(x-> x.getName())
                        .forEach(System.out::println);
            }
        }
    }
}