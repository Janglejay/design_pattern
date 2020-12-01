package builder;

public class Test {
    public static void main(String[] args) {
        House house = new SmallHouseBuilder().buildHeight(1).buildName("sss").build();
        System.out.println(house);
    }
}
