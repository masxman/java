import java.io.*;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String city = null;
        try {
            if (city.equals("Bangalore"))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught");
        } finally {
            System.out.println("This is finally block");
        }
    }
}
