package lesson15.hashmap;

public interface MyMap {
    void put(String key, String value);
    String get(String key);
    String remove(String key);
    boolean contains(String key);
    int size();
}



