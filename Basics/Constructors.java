package Basics;

public class Constructors {
    static class Student {
        int rollNo = 31;
        String name;
        float percentage = 94.5f;

        void getName() {
            // Both print same values
            this.name = "RRJ";
            name = "RRJ";
            System.out.println("Name of Student in class : " + this.name);
        }

        Student(int roll, String nm, float per) {
            this.rollNo = roll;
            name = nm;
            percentage = per;
        }
    }

    // Constructor Chaining

    public class Operations {
        int a, b, c;

        // Default Constructor
        Operations() {
            this(13, 45);
            System.out.println("Default constructor called");
        }

        Operations(int a, int b) {
            this.a = a;
            System.out.print("Sum of two values: ");
            System.out.println(a + b);
        }

        Operations(int a, int b, int c) {
            this(30, 20);
            this.a = 1;
            this.b = 2;
            this.c = 3;
            System.out.print("Sum of three values: ");
            System.out.println(b + c);
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student(12, "HRJ", 42.349f);

        // Prints default values
        System.out.println("Name of Student: " + std1.name);
        System.out.println("Rollno of Student: " + std1.rollNo);
        System.out.println("Age of Student: " + std1.percentage);

        // Prints intialized values

        std1.getName();

        System.out.println("Name of Student: " + std1.name);
        System.out.println("Rollno of Student: " + std1.rollNo);
        System.out.println("Age of Student: " + std1.percentage);

        // Reference to non-static method
        Constructors constructor = new Constructors();
        Operations op1 = constructor.new Operations(2, 3, 3);
        System.out.println("Sum of a, b, and c: " + (op1.a + op1.b + op1.c));

        Operations op2 = constructor.new Operations();
        System.out.println("Final values of a, b, c: " + op2.a + " " + op2.b + " " + op2.c);

    }
}
