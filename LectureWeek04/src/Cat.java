public abstract class Cat extends Animal implements Prt {

    public Cat(String name, int population, String kingdom) {
        super(name, population, kingdom);
    }

    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public void whatAnimal() {

    }
}
