public class House {
    private final String address;
    private final int floors;
    private final int area;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final int price;

    private House(HouseBuilder builder) {
        this.address = builder.address;
        this.floors = builder.floors;
        this.area = builder.area;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.price = builder.price;
    }

    public static class HouseBuilder {
        private String address;
        private int floors;
        private int area;
        private boolean hasGarage;
        private boolean hasGarden;
        private int price;

        public HouseBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setArea(int area) {
            this.area = area;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House {" +
                "address='" + address + '\'' +
                ", floors=" + floors +
                ", area=" + area + "m²" +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", price=$" + price +
                '}';
    }
}
