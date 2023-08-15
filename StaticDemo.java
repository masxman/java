class Student {
    static String collegeName = "PES College";
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(collegeName + " " + rollno + " " + name);
    }
}

public class StaticDemo {
    public static void main(String args[]) {
        System.out.println("Objects Sharing the static variable - college name\n");
        Student s1 = new Student(1001, "Srikanth");
        Student s2 = new Student(1002, "Indumathi");
        s1.display();
        s2.display();
        System.out.println("\nStatic value changed by one of the object\n");
        s1.collegeName = "Jain College";
        s1.display();
        s2.display();
    }
}
