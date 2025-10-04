public class Main {
    public static void main(String[] args) {
        House modernBrickHouse = new ModernHouse(new BrickConstruction());
        modernBrickHouse.build();

        System.out.println("----");

        House classicWoodHouse = new ClassicHouse(new WoodConstruction());
        classicWoodHouse.build();
    }
}
