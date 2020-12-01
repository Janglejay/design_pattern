
package observer;

import java.util.ArrayList;
import java.util.List;

abstract class MySubject {
    protected List<MyObserver> observers = new ArrayList<MyObserver>();
    //增加观察者方法
    public void add(MyObserver observer) {
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(MyObserver observer) {
        observers.remove(observer);
    }
    public abstract void notifyObserver(); //通知观察者方法
}
