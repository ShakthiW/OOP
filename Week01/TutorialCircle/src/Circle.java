public class Circle {
    private String colour;
    private double radius;

    public Circle(){
        radius = 1;
        colour = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        colour = "Blue";
    }

    public Circle(String c, double radius){
        this.radius = radius;
        colour = c;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double area = radius*radius*Math.PI;
        return (double) Math.round(area * 100) / 100;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String toString() {
        return "Circle{" +
                "colour='" + colour + '\'' +
                ", radius=" + radius +
                '}';
    }
}