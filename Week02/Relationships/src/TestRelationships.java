public class TestRelationships {
    public static void main(String[] args) {
        //simple association
        Employee emp1 = new Employee(101);
        Laptop lap1  = new Laptop(123456);
        // later we can set the laptop of an employee
        emp1.setLaptop(lap1);
        System.out.println(emp1);
        System.out.println(lap1);
        //deleteing one object will not delete the other obj
        lap1 = null;
        System.out.println(emp1);
        try{
            System.out.println(lap1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        //Aggregation
        Engine engine1 = new Engine(2000);
        Body body1 = new Body("Sedan");
        //To create you must have created its parts first as above
        Car c1 = new Car(engine1,body1);
        System.out.println(c1);
        System.out.println(engine1);
        System.out.println(body1);

        //Now we will delete the whole (Car)
        c1 = null;
        //Still the parts (engine and body will exist)
        System.out.println(engine1);
        System.out.println(body1);
        //But Car has been deleted
        System.out.println(c1);


        //Composition
        Book book1 = new Book("ISBM10015",46,"Harry potter killed vaulder");
        //We don't have access to the page object as page object was created inside Book constructor
        System.out.println(book1);
        System.out.println(book1.getPage());
        //if we deleted the whole (book) we will lose the page also
        book1 = null;
        System.out.println(book1);



    }
}
