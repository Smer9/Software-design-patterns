public class Main {
    public static void main(String[] args) {
        House villa = new House.HouseBuilder()
                .setAddress("Almaty, Dostyk Ave 123")
                .setFloors(2)
                .setArea(350)
                .setHasGarage(true)
                .setHasGarden(true)
                .setPrice(250000)
                .build();

        House apartment = new House.HouseBuilder()
                .setAddress("Astana, Nazarbayev Ave 45")
                .setFloors(1)
                .setArea(80)
                .setHasGarage(false)
                .setHasGarden(false)
                .setPrice(75000)
                .build();

        System.out.println(villa);
        System.out.println(apartment);
    }
}
