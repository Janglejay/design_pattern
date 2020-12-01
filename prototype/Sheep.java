package prototype;

public class Sheep implements Cloneable {

    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }
}
