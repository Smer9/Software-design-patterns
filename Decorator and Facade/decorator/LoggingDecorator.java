package decorator;

public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("[LOG] Turning on device...");
        super.turnOn();
        System.out.println("[LOG] Device successfully turned on.");
    }
}
