public class Class  {
    private int n;
    private String name;

    public Class(int n, String name) {
        this.n = n;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "n=" + n +
                ", name='" + name + '\'' +
                '}';
    }
}
