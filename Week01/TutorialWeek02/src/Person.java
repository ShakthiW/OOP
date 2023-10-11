public class Person {
    private String name;
    private String surname;
    private int age;


    public Person(String n) {
        name = n;
    }

    // display the name

    public String DisplayName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
