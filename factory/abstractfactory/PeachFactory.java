package factory.abstractfactory;


public class PeachFactory implements AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
