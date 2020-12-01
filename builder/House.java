package builder;

public class House {
    private String name;
    private int height;
    private int price;

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
