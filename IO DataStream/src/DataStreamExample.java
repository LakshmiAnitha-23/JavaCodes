import java.io.*;

public class DataStreamExample
{
    public static void main(String[] args)
    {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin")))
        {
            dos.writeInt(25);
            dos.writeDouble(99.75);
            dos.writeBoolean(true);
            System.out.println("Data written successfully");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin")))
        {
            int age = dis.readInt();
            double score = dis.readDouble();
            boolean status = dis.readBoolean();

            System.out.println("Read Data: Age=" + age + ", Score=" + score + ", Status=" + status);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}