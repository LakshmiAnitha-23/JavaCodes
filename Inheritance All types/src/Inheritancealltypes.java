class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    void work()
    {
        System.out.println(name + "is working in the company");
    }

    void displayInfo()
    {
        System.out.println("Name: " + name + " | salary : ₹" + salary);
    }
}

class Developer extends Employee
{
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage)
    {
        super(name,salary);
        this.programmingLanguage = programmingLanguage=programmingLanguage;
    }

    void developSoftware()
    {
        System.out.println(name + " develops applicaton using" + programmingLanguage + ".");
    }
}

class TeamLead extends Developer {
    int teamSize;

    TeamLead(String name, double salary, String programmingLanguage, int teamSize)

    {
        super(name, salary, programmingLanguage);
        this.teamSize = teamSize;
    }

    void manageTeam()
    {
        System.out.println(name + "manage a team of " + teamSize + " developer");
    }
}

class Tester extends Employee
{
    String tool;

    Tester(String name, double salary, String tool)
    {
        super(name,salary);
        this.tool=tool;
    }

    void testSoftware()
    {
        System.out.println(name + "test software using " + tool + ".");
    }
}

interface Trainer
{
    void conductTraining();
}

interface projectManager
{
    void handleproject();
}

class SeniorManager extends TeamLead implements Trainer, projectManager
{
    SeniorManager(String name, double salary, String language, int teamSize)
    {
        super(name,salary,language,teamSize);
    }

    public void conductTraining()
    {
        System.out.println(name + "conducts technical training for employees");
    }

    public void handleproject()
    {
        System.out.println(name + "oversees the successfull delivery of projects");
    }

    @Override
    void manageTeam()
    {
        System.out.println(name + "manages multiple teams efficiently");
    }
}

public class Inheritancealltypes
{
    public static void main(String[] args)
    {
        System.out.println("=== single inheritance ===");
        Developer dev = new Developer("Ravi", 70000, "Java");
        dev.displayInfo();
        dev.work();
        dev.developSoftware();

        System.out.println("\n=== multilevel inheritance ===");
        TeamLead lead = new TeamLead("Anitha", 90000, "python", 5);
        lead.displayInfo();
        lead.work();
        lead.developSoftware();
        lead.manageTeam();

        System.out.println("\n=== Hierarchial inheritance ===");
        Tester tester = new Tester("kiran", 60000, "selenium");
        tester.displayInfo();
        tester.work();
        tester.testSoftware();

        System.out.println("\n=== multiple inheritance ===");
        SeniorManager sm = new SeniorManager("Lakshmi", 120000, "Java", 3);
        sm.displayInfo();
        sm.work();
        sm.developSoftware();
        sm.manageTeam();
        sm.conductTraining();
        sm.handleproject();
    }
}