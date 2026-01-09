import java.util.Arrays;

public class stringmethods
{
    public static void main (String[] args)
    {
        String s1 = "java is awesome";
        String s2 = "789";
        String s3 = "";
        System.out.println(s1.length());
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.charAt(8));
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
        System.out.println(Integer.valueOf(s2));
        char[]a = s1.toCharArray();
        System.out.println(a);
        System.out.println(s1.substring(2,6));
        System.out.println(Arrays.toString(s1.split(" ")));

    }
}
