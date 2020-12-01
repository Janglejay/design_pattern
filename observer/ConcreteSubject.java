package observer;


public class ConcreteSubject extends MySubject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Object obs : observers) {
            ((MyObserver) obs).response();
        }
    }
}
