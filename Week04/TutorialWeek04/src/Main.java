public class Main {
    public static void main(String[] args) {
        // testing circles
        GeometricObject circle1 = new Circle();
        GeometricObject circle2 = new Circle(2.5);
        GeometricObject circle3 = new Circle(true, "Red", 7);

        System.out.println("Circle 1: Area = " + String.format("%.2f", circle1.getArea()) + ", Perimeter = " + String.format("%.2f", circle1.getPerimeter()) + ", Shape = " + circle1.getShape());
        System.out.println("Circle 2: Area = " + String.format("%.2f", circle2.getArea()) + ", Perimeter = " + String.format("%.2f", circle2.getPerimeter()) + ", Shape = " + circle2.getShape());
        System.out.println("Circle 3: Area = " + String.format("%.2f", circle3.getArea()) + ", Perimeter = " + String.format("%.2f", circle3.getPerimeter()) + ", Shape = " + circle3.getShape());

        System.out.println();

        // testing rectangle
        GeometricObject rectangle1 = new Rectangle();
        GeometricObject rectangle2 = new Rectangle(2.5, 3.4);
        GeometricObject rectangle3 = new Rectangle(false, "Red", 7 , 4);

        System.out.println("Rectangle 1: Area = " + String.format("%.2f", rectangle1.getArea()) + ", Perimeter = " + String.format("%.2f", rectangle1.getPerimeter()) + ", Shape = " + rectangle1.getShape());
        System.out.println("Rectangle 2: Area = " + String.format("%.2f", rectangle2.getArea()) + ", Perimeter = " + String.format("%.2f", rectangle2.getPerimeter()) + ", Shape = " + rectangle2.getShape());
        System.out.println("Rectangle 3: Area = " + String.format("%.2f", rectangle3.getArea()) + ", Perimeter = " + String.format("%.2f", rectangle3.getPerimeter()) + ", Shape = " + rectangle3.getShape());

        System.out.println();

        // testing square
        GeometricObject square1 = new Square();
        GeometricObject square2 = new Square(2.5);
        GeometricObject square3 = new Square(true, "Red", 7);

        System.out.println("Square 1: Area = " + String.format("%.2f", square1.getArea()) + ", Perimeter = " + String.format("%.2f", square1.getPerimeter()) + ", Shape = " + square1.getShape());
        System.out.println("Square 2: Area = " + String.format("%.2f", square2.getArea()) + ", Perimeter = " + String.format("%.2f", square2.getPerimeter()) + ", Shape = " + square2.getShape());
        System.out.println("Square 3: Area = " + String.format("%.2f", square3.getArea()) + ", Perimeter = " + String.format("%.2f", square3.getPerimeter()) + ", Shape = " + square3.getShape());
    }
}