package decorator;

public class Lamp implements Device {
    @Override
    public void turnOn() {
        System.out.println("Lamp is shining.");
    }
}
