import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteProgram {
    
    public static void main(String[] args) {

        File textFile = new File("main.txt");

        try {
            FileWriter writer = new Filewriter(textFile);
            writer.write("Hello World");
            writer.close();
            System.out.prinln("printed successfully");

        } catch (Exception e) {
            System.out.println("Nag error siya");
            e.printStackTrace();
        }



            

        }
    }

