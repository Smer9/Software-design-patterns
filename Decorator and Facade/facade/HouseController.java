package facade;

import decorator.Device;
import decorator.EcoModeDecorator;
import decorator.LoggingDecorator;

public class HouseController {
    public void startDevice(Device device, boolean useEcoMode, boolean useLogging) {
        if (useEcoMode) device = new EcoModeDecorator(device);
        if (useLogging) device = new LoggingDecorator(device);

        device.turnOn();
    }
}
