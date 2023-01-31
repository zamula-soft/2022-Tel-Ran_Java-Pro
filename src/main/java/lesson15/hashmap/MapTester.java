package lesson15.hashmap;

public class MapTester {
    public static void main(String[] args) {
        MyHasMap map = new MyHasMap();
        map.put("Moldova", "Cishinev");
        map.put("Hungary", "Budapest");
        map.put("Sweden", "Stocholm");
        map.put("Poland", "Warsaw");
        map.put("Estonia", "Tallin");

        System.out.println(map.get("Moldova"));
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.capacity());
    }
}
