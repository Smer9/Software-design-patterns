public class House {
    private HeatingStrategy heatingStrategy;

    public House(HeatingStrategy heatingStrategy) {
        this.heatingStrategy = heatingStrategy;
    }

    public void setHeatingStrategy(HeatingStrategy heatingStrategy) {
        this.heatingStrategy = heatingStrategy;
    }

    public void heatHouse() {
        System.out.print("House: ");
        heatingStrategy.heat();
    }
}
