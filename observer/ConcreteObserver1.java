package observer;

public class ConcreteObserver1 implements MyObserver {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
