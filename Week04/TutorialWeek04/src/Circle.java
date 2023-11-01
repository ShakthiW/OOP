public class Circle extends GeometricObject {
    protected double radius;

    // Constructors
    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }


    // getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overrides
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.radius * 2 ;
    }

    @Override
    public String getShape() {
        return "Circle";
    }
}
