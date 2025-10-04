public class ModernHouse extends House {
    public ModernHouse(ConstructionStyle style) {
        super(style);
    }

    @Override
    public void build() {
        System.out.println("Building a modern house:");
        style.buildWalls();
        style.buildRoof();
    }
}

