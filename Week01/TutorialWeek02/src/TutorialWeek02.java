public class TutorialWeek02 {
    public static void main(String[] args) {
        Person p = new Person("Ben");
        Person p2 = new Person("Jhon");
        Person p3 = new Person("Smith");

        p.setSurname("Tennison");
        p.setAge(23);

        p2.setSurname("Doe");
        p2.setAge(16);

        p3.setSurname("Steven");
        p3.setAge(18);

        String display1 = p.DisplayName() + " " + p.getSurname() + " " + p.getAge() + ".";
        String display2 = p2.DisplayName() + " " + p2.getSurname() + " " + p2.getAge() + ".";
        String display3 = p3.DisplayName() + " " + p3.getSurname() + " " + p3.getAge() + ".";

        System.out.println(display1);
        System.out.println(display2);
        System.out.println(display3);
    }
}