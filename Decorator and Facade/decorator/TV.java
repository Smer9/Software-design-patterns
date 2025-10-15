package decorator;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is on.");
    }
}
