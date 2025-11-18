import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException {

        /*File file = new File("C:\\Users\\sunyn\\file.txt");

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        File file = new File("C:\\Users\\sunyn\\file.txt");


            FileReader fr = new FileReader(file);



    }
}
