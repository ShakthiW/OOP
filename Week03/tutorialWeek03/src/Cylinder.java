public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    // Inherited constructors
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder (double height, double radius, String color ) {
        super(radius, color);
        this.height = height;
    }

    // getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Volume
    public double getVolume() {
        return super.getArea() * height;
    }
}
