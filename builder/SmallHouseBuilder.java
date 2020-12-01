package builder;

public class SmallHouseBuilder extends Builder{

    private House house = new House();
    @Override
    public Builder buildName(String name) {
        this.house.setName(name);
        return this;
    }

    @Override
    public Builder buildHeight(int height) {
        this.house.setHeight(height);
        return this;
    }

    @Override
    public Builder buildPrice(int price) {
        this.house.setPrice(price);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
