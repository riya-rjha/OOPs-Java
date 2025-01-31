package Generics;

public class ComparableGenerics {
    // Generics Student
    static class Student implements Comparable<Student> {
        int rno;
        String name;
        float marks;

        public Student(int rno, float marks, String name) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student cStudent) {
            int diff = (int) (this.marks - cStudent.marks);
            if (diff == 0) {
                System.out.println("Both marks are equal");
            } else if (diff > 1) {
                System.out.println(this.name + " has more marks than " + cStudent.name);
            } else {
                System.out.println(cStudent.name + " has more marks than " + this.name);
            }
            return diff;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(21, 42.24f, "RRJ");
        Student student2 = new Student(314, 34.342f, "HRJ");

        // Create a list of students
        // sort on the basis of marks
        

        // Create a custom comparator
        

        // Using Lambda functions


        System.out.println(student.compareTo(student2));
    }
}
