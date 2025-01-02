public class Abstraction {
    public static abstract class Parent {
        static String name;
        int age;

        abstract void getName(); // idea

        abstract void getCareer();

        Parent(int age) {
            this.age = age;
        }

        public int returnParentAge() {
            return this.age;
        }
    }

    public static class Child extends Parent {
        int age;

        Child(int age) {
            super(age);
            this.age = age;
        }

        @Override
        public void getName() { // implementation
            System.out.println("My name is Child");
        }

        @Override
        public void getCareer() {
            System.out.println("I am going to be a Microsoft Intern");
        }
    }

    public static void main(String[] args) {
        // Parent parent = new Parent(); // cannot create objects of Abstract classes
        Child child = new Child(10);
        child.getName();
        child.getCareer();

        // Here, at compile time referential class declares methods available (Parent)
        // at runtime, object class declares method executable (Child)

        Parent childParent = new Child(31);
        System.out.println(childParent.returnParentAge()); // all methods of Parent available
        System.out.println(childParent.getClass());
        childParent.getCareer(); // Child class methods available too

        Parent.name = "Bob"; // static methods declaration of abstract class Parent

    }
}
