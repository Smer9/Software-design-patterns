public class ClassicHouseFactory extends HouseFactory {
    @Override
    public HouseType createHouse() {
        return new ClassicHouse();
    }

    @Override
    public Roof createRoof() {
        return new ClassicRoof();
    }
}

