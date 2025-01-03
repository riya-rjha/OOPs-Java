package Interfaces;

public class Interface {

    public interface Car {
        int maxSpeed = 0; // public, final and static

        void engineStart(); // public and abstract

        void musicPlayerStart();

        void engineStop(int maxSpeed);

        // Cannot create a constructor of Interface
        // Car(){}

        public static void reinit() {
            // maxSpeed = 13; // can not be initialized
        }
    }

    public interface InnerCar extends Car {
        void noOfSeats(int seats);
    }

    public class ElectricalEngine implements InnerCar {
        @Override
        public void engineStart() { // added public as in interface all methods are public by default
            System.out.println("Electrical engine car started");
        }

        @Override
        public void musicPlayerStart() {
            System.out.println("Electrical engine car music player stopped");
        }

        @Override
        public void engineStop(int maxSpeed) {
            System.out.println("Electrical engine car stopped at " + maxSpeed + " km/hr");
        }

        @Override
        public void noOfSeats(int seats) {
            System.out.println("This electrical engine car is a " + seats + " seater");
        }

        public MechanicalEngine changeCarType(ElectricalEngine electricalEngine) {
            System.out.println("Electrical engine car changed to Mechanical engine");
            return new MechanicalEngine();
        }
    }

    public class MechanicalEngine implements InnerCar {
        @Override
        public void engineStart() { // added public as in interface all methods are public by default
            System.out.println("Mechanical engine car started");
        }

        @Override
        public void musicPlayerStart() {
            System.out.println("Mechanical engine car music player stopped");
        }

        @Override
        public void engineStop(int maxSpeed) {
            System.out.println("Mechanical engine car stopped at " + maxSpeed + " km/hr");
        }

        @Override
        public void noOfSeats(int seats) {
            System.out.println("This mechanical engine car is a " + seats + " seater");
        }
    }

    public interface A {
        int num = 32;
    }

    public interface B {
        int num = 24;
    }

    // Multiple Inheritance

    public class C implements A, B {
        C() {
            super();
        }

        public int valueOfNumInA() {
            return A.num;
        }

        public int valueOfNumInB() {
            return B.num;
        }
    }

    // Custom Annotations

    public @interface MyCustomAnnotation {
        String value();
    }

    public class CreatingAnnotations {
        @MyCustomAnnotation(value = "Creating Custom Annotations")
        public void callAnotation() {
            System.out.println("This is a custom annotation");
        }
    }

    public static void main(String[] args) {
        Interface interface1 = new Interface();
        // InnerCar innerCar = interface1.new InnerCar(); // instantiation of interfaces
        // does not take place

        ElectricalEngine electricalEngine = interface1.new ElectricalEngine();
        electricalEngine.engineStart();
        electricalEngine.engineStop(319);
        electricalEngine.noOfSeats(4);

        MechanicalEngine mechanicalEngine = electricalEngine.changeCarType(electricalEngine);
        mechanicalEngine.engineStart();
        mechanicalEngine.engineStop(2);

        C c = interface1.new C();
        System.out.println(c.valueOfNumInA());
        System.out.println(c.valueOfNumInB());

        // Custom Annotations
        CreatingAnnotations creatingAnnotations = interface1.new CreatingAnnotations();

        // Access the annotation using reflection
        MyCustomAnnotation myCustomAnnotation = null;
        try {
            myCustomAnnotation = creatingAnnotations.getClass().getMethod("callAnotation")
                    .getAnnotation(MyCustomAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println(myCustomAnnotation.value());

    }
}
