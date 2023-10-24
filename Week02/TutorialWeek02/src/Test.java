/*
 * A test class for the Director class.
 */
public class Test {
    public static void main(String[] args) {
        // Test constructor
        Director director = new Director("James", "Cameron");

        // Test Setters and Getters

        // Crete an object Date to represent the dob
        Date dob = new Date(16, 8, 1954);

        director.setDoB(dob);
        director.setNumDirectedMovies(23);

        System.out.println(director); // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDoB().getDate());
        System.out.println("number of directed movies is: " + director.getNumDirectedMovies());


        // Test Movie's constructor and toString()
        Movie movie = new Movie("Avatar", "Fantasy",director);
        System.out.println(movie); // Movie's toString()
        // Test Setters and Getters
        movie.setNumAwards(23);

        System.out.println(movie); // toString()
        System.out.println("title is: " + movie.getMovie());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurname());
        System.out.println("number of awards is " + movie.getNumAwards());
    }
}
