package packages;

public class Packages {
    public static void main(String[] args) {
        Greetings.greetUser("RRJ");
        Packages p = new Packages();
        New nn = new New();
        System.out.println(New.Name);
        New.Name = "Robert";
        System.out.println(New.Name);
    }

    static{
        System.out.println("Executed only once and first");
    }

    static class New {
        static String Name;

        New() {
            New.Name = "Rob";
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
