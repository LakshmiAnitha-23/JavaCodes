class Employee
{
    public String name="John";
    private double salary=50000;
    protected String dept="IT";
    int age=30;

    public void showDetails()
    {
        System.out.println("Name: "+ name);
        System.out.println("salary:" + salary);
        System.out.println("Department:" +dept);
        System.out.println("Age: "+age);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Employee e=new Employee();
        e.showDetails();
    }
}