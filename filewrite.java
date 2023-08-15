import java.io.*;

public class filewriter {
    public static void main(String args[]) {
        try {
            String data = "BCA students are very intelligent";
            FileWriter fw = new FileWriter("File2.txt", true);
            char ch[] = data.toCharArray();
            fw.write(ch);
            System.out.println("File Write Successful");
            fw.close();
        } catch (IOException e) {
            System.out.println("Exception Occured");
        }
    }
}
