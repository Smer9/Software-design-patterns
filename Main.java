public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .setWalls("Brick Walls")
                .setRoof("Concrete Roof")
                .setWindows(4)
                .build();

        System.out.println("Built with Builder Pattern: " + house);

        HouseFactory modernFactory = new ModernHouseFactory();
        HouseFactory classicFactory = new ClassicHouseFactory();

        HouseType modernHouse = modernFactory.createHouse();
        Roof modernRoof = modernFactory.createRoof();

        HouseType classicHouse = classicFactory.createHouse();
        Roof classicRoof = classicFactory.createRoof();

        System.out.println("Abstract Factory - " + modernHouse.getType() + " with " + modernRoof.getMaterial());
        System.out.println("Abstract Factory - " + classicHouse.getType() + " with " + classicRoof.getMaterial());
    }
}
