public class BrickConstruction implements ConstructionStyle {
    @Override
    public void buildWalls() {
        System.out.println("Building strong brick walls...");
    }

    @Override
    public void buildRoof() {
        System.out.println("Adding concrete roof...");
    }
}
