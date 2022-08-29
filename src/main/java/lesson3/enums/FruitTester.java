package lesson3.enums;

public class FruitTester {
    public static void main(String[] args) {
        Fruits f = Fruits.BANANA;
        System.out.println(f.toString());
        System.out.println(f.ordinal());
        Fruits a = Fruits.valueOf("APRICOT");
        Fruits a1 = Fruits.APRICOT;

        System.out.println(a1.getCalories());

    }
}
