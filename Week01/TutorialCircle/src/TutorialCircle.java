public class TutorialCircle {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(8);
        Circle C3 = new Circle("red", 5);


        System.out.println("The circle has a radius of " + C1.getRadius() + " and area of " + C1.getArea());
        System.out.println("The circle has a radius of " + C2.getRadius() + " and area of " + C2.getArea());
        System.out.println(C1.getColour() + " " + C2.getColour() + " " + C3.getColour());


        C1.setColour("pink");
        C1.setRadius(5);

        C2.setColour("Orange");
        C2.setRadius(9);

        C3.setColour("White");
        C3.setRadius(12);

        System.out.println("The circle has a radius of " + C1.getRadius() + " and area of " + C1.getArea());
        System.out.println("The circle has a radius of " + C2.getRadius() + " and area of " + C2.getArea());
        System.out.println(C1.getColour() + " " + C2.getColour() + " " + C3.getColour());


        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());

    }
}