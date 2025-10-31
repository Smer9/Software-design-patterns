public class Main {
    public static void main(String[] args) {
        House house = new House(new GasHeating());
        house.heatHouse();

        house.setHeatingStrategy(new ElectricHeating());
        house.heatHouse();

        house.setHeatingStrategy(new SolarHeating());
        house.heatHouse();
    }
}
