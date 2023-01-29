package lesson15.hashmap;

public class MapTester {
    public static void main(String[] args) {
        MyHasMap map = new MyHasMap();
        map.put("Moldova", "Cishinev");
        map.put("Hungary", "Budapest");

        System.out.println(map.get("Moldova"));
        System.out.println(map.size());
    }
}
