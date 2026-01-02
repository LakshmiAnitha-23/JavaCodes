class company
{
    static String companyName="EIDIKO";
    int empId;
    String empName;

    company(int id, String name)
    {
        empId=id;
        empName=name;
    }

    static void showcompanyName()
    {
        System.out.println("company: "+ companyName);
    }
    void showEmployee()
    {
        System.out.println("Employee ID: "+ empId + ",Name: "  + empName);
    }
}
public class staticDemo
{
    public static void main(String[] args)
    {
        company.showcompanyName();

        company emp1 = new company(101,"Alice");
        company emp2 = new company(102,"Bob");

        emp1.showEmployee();
        emp2.showEmployee();
    }
}