package observer;

public class ObserverPattern {
    public static void main(String[] args) {
        MySubject subject = new ConcreteSubject();
        MyObserver obs1 = new ConcreteObserver1();
        MyObserver obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
