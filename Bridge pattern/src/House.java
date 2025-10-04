public abstract class House {
    protected ConstructionStyle style;

    protected House(ConstructionStyle style) {
        this.style = style;
    }

    public abstract void build();
}
