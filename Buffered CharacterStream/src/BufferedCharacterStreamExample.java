import java.io.*;

public class BufferedCharacterStreamExample
{
    public static void main(String[] args)
    {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            System.out.println("Text copied Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}