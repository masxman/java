public class methodOverloadingDemo {
    int addition() {
        return (10 + 10);
    }
    
    int addition(int x, int y) {
        return (x + y);
    }
    
    float addition(float a, float b) {
        return (a + b);
    }
    
    public static void main(String args[]) {
        methodOverloadingDemo a = new methodOverloadingDemo();
        System.out.println("By using default values, Sum is : " + a.addition());
        System.out.println("Sum of Two Integer values (10 and 20) is :" + a.addition(10, 20));
        System.out.println("Sum of Two Float values (10.5 and 20.5) is :" + a.addition(10.5f, 20.5f));
    }
}
