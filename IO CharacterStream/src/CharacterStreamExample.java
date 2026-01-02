import java.io.*;

public class CharacterStreamExample
{
    public static void main(String[] args)
    {
        try(FileReader reader = new FileReader("C:\\Java Training\\IO Byte stream\\input.txt");
            FileWriter writer = new FileWriter("C:\\Java Training\\IO Byte stream\\input.txt"))
        {
            int charData;
            while ((charData = reader.read()) != -1)
            {
                writer.write(charData);
            }
            System.out.println("text file copied successfully");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}