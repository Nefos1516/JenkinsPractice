import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileWriter writer = new FileWriter("artifact.txt");
            writer.write("Я крутой файл в Jenkins");
            writer.close();
            System.out.println("File created");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}