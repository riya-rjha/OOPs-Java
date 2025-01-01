package dir;
import java.util.List;
import java.util.ArrayList;
public class AccessModifiers2 {

    public class ParentClass {
        public int num;
        private int password = 312;
        protected String name = "Robert Frost";
        int defaultVal = 3;

        ParentClass() {

        }

        public ParentClass(int num, int defaultVal) {
            this.num = num;
            this.defaultVal = defaultVal;
        }

        public void display() {
            System.out.println("Number: " + num);
        }

        private int displayPassword() {
            return password;
        }

        protected void setName(String nameString) {
            name = nameString;
        }

        void printDefaultValue() {
            System.out.println("This is the default value: " + defaultVal);
        }

    }

    class ChildClass extends ParentClass {
        // Within ChildClass, only public, protected and default can be accessed
        public void show() {
            display();
        }

        ChildClass() {
            super();
        }

        public List<Integer> returnParentClassVariables(){
            List<Integer> lst = new ArrayList<>();
            int childClassNum = num; // public
            // int childClassPassword = password; // cannot access private instances in sub-class within the same package
            String childClassName = name; // protected
            int childClassDefaultVal = defaultVal; // default
            lst.add(childClassNum);
            lst.add(childClassName.hashCode());
            lst.add(childClassDefaultVal);
            return lst;
        }

    }

    public static void main(String[] args) {
        // Within the class, instances can be accessed anywhere
        AccessModifiers2 accessModifiers = new AccessModifiers2();
        ParentClass parentClass = accessModifiers.new ParentClass(321, 42);
        System.out.println(parentClass.password);
        parentClass.printDefaultValue();
        parentClass.displayPassword();
    }
}