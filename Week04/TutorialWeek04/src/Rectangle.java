public class Rectangle extends GeometricObject {
    protected double width, height;

    // Constructors
    public Rectangle() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(boolean filled, String color, double width, double height) {
        super(filled, color);
        this.width = width;
        this.height = height;
    }

    // getters & setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // Overrides
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }
}
