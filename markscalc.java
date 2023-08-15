import java.util.*;

class Studentone {
    Scanner sc = new Scanner(System.in);
    String enrol_id;
    String name;
    int sub1, sub2, sub3, total;

    public static void main(String args[]) {
        Studentone s1 = new Studentone();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details");
        System.out.println("Enter student name");
        s1.name = sc.next();
        System.out.println("Enter student id no");
        s1.enrol_id = sc.next();
        System.out.println("Enter marks of subject1");
        s1.sub1 = sc.nextInt();
        System.out.println("Enter marks of subject2");
        s1.sub2 = sc.nextInt();
        System.out.println("Enter marks of subject3");
        s1.sub3 = sc.nextInt();

        if (s1.sub1 >= 50 && s1.sub2 >= 50 && s1.sub3 >= 50)
            s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        else
            s1.total = 0;

        System.out.println("Student Total Marks = " + s1.total);
    }
}
