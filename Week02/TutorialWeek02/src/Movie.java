public class Movie {
    private String movie;
    private String category;
    private int numAwards;
    private Director director;

    // Constructor
    public Movie(String movie, String category, Director director) {
        this.movie = movie;
        this.category = category;
        this.director = director;
    }

    // Getters
    public String getMovie() {
        return movie;
    }

    public String getCategory() {
        return category;
    }

    public int getNumAwards() {
        return numAwards;
    }

    public Director getDirector() {
        return director;
    }

    // Setters

    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    @Override
    public String toString() {
        return "Movie [ title = " + movie + ", " + "category = " + category + ", director name = " +
                director.getName() + ", director surname = " + director.getSurname() + ", number of awards = " +
                numAwards + " ]";
    }
}
