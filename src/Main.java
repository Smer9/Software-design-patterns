public class Main {
    public static void main(String[] args) {
        House house = new House();

        Device tv = new TV();
        OldLamp oldLamp = new OldLamp();
        Device oldLampAdapter = new OldLampAdapter(oldLamp);


        house.addDevice(tv);
        house.addDevice(oldLampAdapter);
    }
}