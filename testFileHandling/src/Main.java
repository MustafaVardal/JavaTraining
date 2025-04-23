import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            File file = new File("test.csv");

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Pearl");
            bufferedWriter.write("Deep");
            bufferedWriter.newLine();
            bufferedWriter.write("LIFE");
            bufferedWriter.close();
            logger.info("File is created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            logger.info("Fail.");
        }
    }
}
