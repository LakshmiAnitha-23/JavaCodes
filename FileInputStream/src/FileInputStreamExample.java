import java.io.*;

public class FileInputStreamExample
{
    public static void main(String[] args)
    {
        try (FileInputStream fis = new FileInputStream("C:\\Java Training\\IO Byte stream\\input.txt"))
        {
            int data;
            while ((data = fis.read()) != -1)
            {
                System.out.println((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}