public class Laptop {
    private int serial;

    public Laptop(int serial) {
        this.serial = serial;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "serial=" + serial +
                '}';
    }
}
