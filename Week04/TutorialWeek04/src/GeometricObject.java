public abstract class GeometricObject {
    protected boolean filled;
    protected String color;

    // constructors
    public GeometricObject() {
        this.filled = false;
        this.color = null;
    }

    public GeometricObject(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    // getter methods
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // setter methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }


    // Abstract methods
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String getShape();


    // to String
    @Override
    public String toString() {
        return "GeometricObject{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }


}
