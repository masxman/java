import java.util.*;

public class calculatearea {
    public static void main(String args[]) {
        int radius;
        double circumference, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        radius = sc.nextInt();
        
        circumference = Math.PI * 2 * radius;
        area = Math.PI * radius * radius;
        
        System.out.println("Circumference of circle = " + circumference);
        System.out.println("Area of circle = " + area);
    }
}
