package decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDescription("chocolate");
        setPrice(2.0f);
    }
}
