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

    // Constructor Chaining + Constructor Overloading

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

    public class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void getName() {
            System.out.println("Name of animal is " + name);
        }

    }

    public class Dog extends Animal {
        String name;
        int age;
        String breed;

        Dog(String name, String breed, int age) {
            super(name, age);
            this.breed = breed;
        }

        public void getBreed() {
            System.out.println("Breed of the dog is " + this.breed);
            System.out.println("Breed of the dog is " + breed); // same answer as above
        }

        @Override
        public void getName() {
            super.getName();
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

        // Constructor using another Constructor

        Student std2 = new Student(32, "Bobby", 32.3f);
        System.out.println(std2.name);
        std2 = std1;
        System.out.println(std2.name);

        // Constructor chaining using "super" keyword
        Animal animal = constructor.new Animal("Doggy", 7);
        System.out.println("Name and age of animal is : " + animal.name + " " + animal.age);

        Dog labrador = constructor.new Dog("Rock", "Labrador", 5);
        labrador.getBreed();
        System.out.println(labrador.name); // null -> This is because Dog has it's own name field and here we are trying
        // to access name of the Dog labrador and not that of Animal
        System.out.println("Properties of labrador: " + labrador.name + " " + labrador.breed + labrador.age + " ");
        labrador.getName();

    }
}
