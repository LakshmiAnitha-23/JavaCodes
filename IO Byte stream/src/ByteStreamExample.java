import java.io.*;

public class ByteStreamExample
{
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("C:\\Java Training\\IO Byte stream\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Java Training\\IO Byte stream\\input.txt"))
        {
            int byteData;
            while ((byteData = fis.read()) != -1)
            {
                fos.write(byteData);
            }
            System.out.println("Image copied successfully");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}