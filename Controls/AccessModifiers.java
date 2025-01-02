import dir.AccessModifiers2;
import dir.AccessModifiers2.ParentClass;

public class AccessModifiers {

    public class ChildClass2 extends ParentClass {
        ChildClass2() {
            accessModifiers2.super(42, 3);
        }

        String newName = name; // protected variable can be accessed in subclass in another package
        // since the child class has all information about the parent class

        public void returnProtectedName() {
            System.out.println(newName);
        }
    }

    static AccessModifiers2 accessModifiers2 = new AccessModifiers2();

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        ParentClass parent = accessModifiers2.new ParentClass(42, 3);
        parent.display();
        // Access public and protected members
        System.out.println("Number: " + parent.num);
        // int def = parent.defaultVal; // default cannot be accessed in another package
        // System.out.println(def);
        // int password = parent.password; // private
        // String name = parent.name; // protected cannot be accessed in another package
        int num = parent.num;
        System.out.println(num);
        ChildClass2 childClass2 = accessModifiers.new ChildClass2();
        childClass2.returnProtectedName();
    }
}
