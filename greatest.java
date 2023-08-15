import java.util.*;

public class greatest {
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        if (x > y)
            System.out.println(x + " is larger");
        else
            System.out.println(y + " is larger");
    }
}
