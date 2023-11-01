public class TestCylinder {
    public static void main(String[] args) {
        // Cylinder 1
        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder: "
                + " radius = " + c1.getRadius()
                + " height = " + c1.getHeight()
                + " baseArea = " + c1.getArea()
                + " Volume = " + c1.getVolume()
        );


        // Cylinder 2
        Cylinder c2 = new Cylinder(5.0);

        System.out.println("Cylinder: "
                + " radius = " + c2.getRadius()
                + " height = " + c2.getHeight()
                + " baseArea = " + c2.getArea()
                + " Volume = " + c2.getVolume()
        );

        // Cylinder 3
        Cylinder c3 = new Cylinder(5.0, 10.0);

        System.out.println("Cylinder: "
                + " radius = " + c3.getRadius()
                + " height = " + c3.getHeight()
                + " baseArea = " + c3.getArea()
                + " Volume = " + c3.getVolume()
        );
    }
}