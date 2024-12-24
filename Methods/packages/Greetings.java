package packages;

public class Greetings {

    public static void greetUser(String name) {
        System.out.println("Hello " + name + "!");
    }

    public void seeOfUser(String name) {
        System.out.println("Bye bye " + name + "!");
    }

    public static class Details {
        public String name;
        public int age;
        public float salary;
        public static StringBuilder status = new StringBuilder();
        public static int population;

        public Details(String name, int age, float salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            // accessing static variable
            status.append("Single");
            Details.population += 1;
        }
    }
}
