import java.util.*;

public class Types {

    public class Animal {
        String name;
        int age;
        double weight;

        Animal(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void eat() {
            System.out.println("Animal eats food");
        }
    }

    public class Herbivore extends Animal {
        String plantType;

        Herbivore(String plantType, String name, int age, double weight) {
            super(name, age, weight);
            this.plantType = "Grass";
        }

        public void grazing() {
            System.out.println(this.name + " is grazing " + this.plantType + " in the lawn");
        }
    }

    public class Carnivore extends Animal {
        String preyType;

        Carnivore(String preyType, String name, int age, double weight) {
            super(name, age, weight);
            this.preyType = preyType;
        }

        Carnivore(Herbivore herbivore, String preyType, String name, int age, double weight) {
            super(name, age, weight);
            this.preyType = herbivore.name;
        }

        public void eating() {
            System.out.println(this.name + " is feeding on " + this.preyType + " in the forest");
        }
    }

    public class Deer extends Herbivore {
        String name;

        Deer(String name) {
            super("husk", name, 32, 923.f);
            this.name = name;
        }

        public List<Object> getFields() {
            List<Object> lst = new ArrayList<>();
            lst.add(name);
            lst.add(plantType);
            lst.add(age);
            lst.add(weight);
            lst.add(this.name);
            lst.add(this.plantType);
            lst.add(this.age);
            lst.add(this.weight);
            return lst;
        }
    }

    public static void main(String[] args) {
        Types sol = new Types();

        // Single Level Inheritance

        Animal animal = sol.new Animal("Deer", 3, 31.3f);
        Herbivore deer = sol.new Herbivore("grass", "Deer cub", 12, 32.412f);
        System.out.println(animal.name);
        System.out.println(deer.name);
        deer.grazing();

        // Multi Level Inheritance

        Deer newDeer = sol.new Deer("DirunDa");
        System.out.println(newDeer.getFields());

        // Hierarchical Inheritance

        Carnivore lion = sol.new Carnivore(newDeer, "Goat", "Simba", 10, 42.32f);
        System.out.println(lion.preyType);
        lion.eating();
        System.out.println(lion.name);
    }
}
