package observer;

public class ConcreteObserver2 implements MyObserver {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
