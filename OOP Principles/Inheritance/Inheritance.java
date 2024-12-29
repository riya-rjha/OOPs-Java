public class Inheritance {

    static class Shape {
        int side;
        int a;

        Shape() {
            this.side = -1;
        }

        Shape(int a) {
            this.a = a;
        }

        Shape(Shape newShape) {
            this.a = newShape.a;
            this.side = newShape.side;
        }

        public void printShapeSide() {
            System.out.println("Side of shape is: " + this.side);
        }
    }

    static class Square extends Shape {
        int weight;
        double volume;

        Square() {
            super();
            super.printShapeSide(); //calling methods of parent class
            this.side = 2;
            this.weight = -1;
            System.out.println("Side: " + side + " this.side: " + this.side);
            this.volume = Math.pow(side, 3);
        }

        Square(int side) {
            super();
            this.side = 2;
            this.volume = Math.pow(side, 3);
        }

        Square(Square newSquare) {
            super(newSquare);
        }

        Square(Shape newShape) {
            super(newShape);
            this.side = newShape.side;
            this.weight = -100;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        System.out.println(shape.side); // -1 -> Initialization
        System.out.println(square.side); // updated side
        System.out.println(square.volume); // Initial volume as specified in constructor
        System.out.println(square.weight); // initialized weight
        square = new Square(3);
        System.out.println(square.volume); // 27.0

        // Unique things to learn
        Shape square2 = new Square();
        System.out.println(square2.side);
        // System.out.println(square2.weight); // Shape is the reference class and it
        // does not have weight as it's params

        // Square ss = new Shape(2);

        // Accessing a child class object and initializing using parent class not
        // possible
        // Square ss = new Shape();
        // System.out.println(ss.weight);

        Shape newSqShape = new Square(square2); // goes to constructor of Shape class
        System.out.println(newSqShape.a);
        System.out.println(newSqShape.side);

    }
}