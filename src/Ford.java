public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return super.startEngine();
    }

    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
