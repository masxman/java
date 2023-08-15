import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        boolean result;
        
        try {
            result = file.createNewFile();
            
            if (result) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists at location");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
