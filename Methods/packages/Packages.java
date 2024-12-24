package packages;

public class Packages {
    public static void main(String[] args) {
        Greetings.greetUser("RRJ");
        Packages p = new Packages();
        New nn = new New();
        System.out.println(New.Name);
        New.Name = "Robert";
        System.out.println(New.Name);
        System.out.println(p.toString()); // returns internal toString() method
        System.out.println(nn.toString()); // object not returned
    }

    static {
        System.out.println("Executed only once and first");
    }

    static class New {
        static String Name;

        New() {
            New.Name = "Rob";
        }

        @Override
        public String toString() {
            System.out.println("We have changed the return type of internal toString() method.");
            return Name;
        }
    }

}

// Top-level class
class New {
    static String Name;

    New() {
        New.Name = "Rob";
    }
}
