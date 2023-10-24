public class Director {
    private String name;
    private String surname;
    private int numDirectedMovies;
    private Date DoB;


    // Constructors
    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDoB() {
        return DoB;
    }

    public int getNumDirectedMovies() {
        return numDirectedMovies;
    }

    // Setters

    public void setNumDirectedMovies(int numDirectedMovies) {
        this.numDirectedMovies = numDirectedMovies;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }

    @Override
    public String toString() {
        return "Director [ name = " + name + ", " + "surname = " + surname + ", dob = " + DoB.getDate() + ", " + "movies directed = " + numDirectedMovies + " ]";
    }
}
