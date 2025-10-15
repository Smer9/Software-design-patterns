import decorator.*;
import facade.HouseController;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device lamp = new Lamp();

        HouseController controller = new HouseController();

        System.out.println("=== TV with Logging and Eco Mode ===");
        controller.startDevice(tv, true, true);

        System.out.println("\n=== Lamp with Logging only ===");
        controller.startDevice(lamp, false, true);
    }
}
