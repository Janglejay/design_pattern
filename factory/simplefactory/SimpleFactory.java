package factory.simplefactory;

public class SimpleFactory {
    public Fruit getFruit(String name){
        if ("apple".equals(name)){
            return new Apple();
        }else if ("peach".equals(name)){
            return new Peach();
        }
        return null;
    }
}
