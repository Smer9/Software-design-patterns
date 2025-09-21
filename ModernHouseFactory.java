public class ModernHouseFactory extends HouseFactory {
    @Override
    public HouseType createHouse() {
        return new ModernHouse();
    }

    @Override
    public Roof createRoof() {
        return new ModernRoof();
    }
}
