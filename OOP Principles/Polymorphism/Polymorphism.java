public class Polymorphism {

    public class Shape {
        public void getArea() {
            System.out.println("Area of shape is related to the shape");
        }

        public double returnArea() {
            return 111.11f;
        }
    }

    public class Square extends Shape {

        public void getArea() {
            System.out.println("Area of square is side * side");
        }

        public int returnSum(int a, int b) {
            return a + b;
        }

        public int returnSum(int a, int b, int c) {
            return a + b + c;
        }

    }

    public class Triangle extends Shape {
        double height;
        double base;

        Triangle() {
            // Constructor
        }

        Triangle(double height, double base) {
            this.base = base;
            this.height = height;
        }

        @Override // Check whether this method existgs in Parent class or not
        public void getArea() {
            System.out.println("Area of triangle is half * base * height");
        }

        // @Override // no method like this exists in parent class, thus override throws
        // error
        public void getHeight() {
            System.out.println("Height of the triangle is : " + this.height);
        }

        // @Override // Gives error, as here method is being overloaded
        public double returnArea(double height) {
            return 0.2f * base * height;
        }
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        Shape shape = polymorphism.new Shape();
        Shape square = polymorphism.new Square();
        Shape trisShape = polymorphism.new Triangle();
        Triangle triangle = polymorphism.new Triangle();

        // Method Overriding

        shape.getArea();
        square.getArea();
        trisShape.getArea();
        triangle.getArea();

        // Method Overloading
        
        Square sq = polymorphism.new Square();
        System.out.println(sq.returnSum(3, 12));
        System.out.println(sq.returnSum(312, 13, 2));
    }
}
