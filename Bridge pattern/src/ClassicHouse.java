public class ClassicHouse extends House {
    public ClassicHouse(ConstructionStyle style) {
        super(style);
    }

    @Override
    public void build() {
        System.out.println("Building a classic house:");
        style.buildWalls();
        style.buildRoof();
    }
}
