import packages.Greetings;
import packages.Greetings.Details;

public class PackagesII {
    public static void main(String[] args) {
        Greetings greet = new Greetings();
        greet.seeOfUser("RRJ");

        Details deet = new Greetings.Details("Rob", 31, 324.4f);
        System.out.println(deet.name);
        System.out.println(Details.status); // can be accessed as deet.status also
        // but static variables are accessed through class name.static_var

        System.out.println(Details.population); // After creating deet

        Details deet2 = new Greetings.Details("Rob", 31, 324.4f);
        System.out.println(deet2.name); // After creating deet2
        System.out.println(Details.status);

        System.out.println(Details.population); // Shows value of current population

        

    }
}
