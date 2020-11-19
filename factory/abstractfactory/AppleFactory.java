package factory.factorymethod;

public class AppleFactory extends AbstractFactory{
    @Override
    public Fruit getFruit(String name) {
        return new Apple();
    }
}
