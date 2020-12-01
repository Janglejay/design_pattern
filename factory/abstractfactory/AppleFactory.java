package factory.abstractfactory;


public class AppleFactory implements AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

}
