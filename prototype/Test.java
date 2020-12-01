package prototype;

public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("1");
        try {
            Sheep sheep1 =  sheep.clone();
            Sheep sheep2 =  sheep.clone();
            System.out.println(sheep == sheep1);
            System.out.println(sheep2 == sheep1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
