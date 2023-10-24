public class Car {

    private Engine engine;
    private Body body;

    public Car(Engine engine, Body body) {
        this.engine = engine;
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", body=" + body +
                '}';
    }
}
