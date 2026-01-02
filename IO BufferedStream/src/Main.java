import java.io.*;

public static void main(String[] args)
{
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.jpg")))
    {
        int data;
        while ((data = bis.read()) != -1)
        {
            bos.write(data);
        }
        bos.flush();
        System.out.println("Image copied successfully");
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}