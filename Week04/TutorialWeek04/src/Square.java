public class Square extends GeometricObject{
    protected double side;

    // Constructors
    public Square() {
        super();
        this.side = 0.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean filled, String color, double side) {
        super(filled, color);
        this.side = side;
    }


    // getters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    // Overrides
    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4 ;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
