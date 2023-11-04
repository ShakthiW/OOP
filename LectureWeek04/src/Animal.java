public abstract class Animal {
    private String name;
    private int population;
    private String kingdom;


    public Animal(String name, int population, String kingdom) {
        this.name = name;
        this.population = population;
        this.kingdom = kingdom;
    }

    public abstract String getName();

    public int getPopulation() {
        return population;
    }
}
