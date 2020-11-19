package decorator;

public class Decorator extends Drink{
    private Drink obj;

    @Override
    public float getCost() {
        return super.getPrice() + obj.getCost();
    }
    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + super.getPrice() + "&&" + obj.getDescription() + " " + obj.getPrice();
    }
}
