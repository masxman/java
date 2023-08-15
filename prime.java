import java.util.*;

public class PrimeNumberCheck {
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        boolean flag = false;
        
        // Loop to check divisibility of x with numbers from 2 to x/2
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                flag = true;
                break;
            }
        }
        
        // Output based on whether x is prime or not
        if (!flag)
            System.out.println(x + " is a prime number.");
        else
            System.out.println(x + " is not a prime number.");
    }
}
