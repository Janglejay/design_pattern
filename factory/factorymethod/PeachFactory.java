package factory.factorymethod;

public class PeachFactory extends AbstractFactory {
    @Override
    public Fruit getFruit(String name) {
        return new Peach();
    }
}
