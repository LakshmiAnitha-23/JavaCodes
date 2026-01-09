class User
{
    String username;
    String password;

    User(String username, String password)
    {
        this.username=username;
        this.password = password;
    }

    void displayUser()
    {
        System.out.println("Username: "+ username);
    }

    void checkLogin(String inputpassword)
    {
        if(password.equals(inputpassword))
        {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid password");
        }
    }
}
public class Strings {
    public static void main(String[] args)
    {
        String uname = new String("Anitha123");
        String pwd = new String("Anitha@123");

        User user = new User(uname, pwd);

        user.displayUser();
        user.checkLogin("Anitha@123");
    }
}
