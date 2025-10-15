package decorator;

public class EcoModeDecorator extends DeviceDecorator {
    public EcoModeDecorator(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Activating Eco Mode...");
        super.turnOn();
    }
}
