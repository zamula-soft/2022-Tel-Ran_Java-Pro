package lesson15.hashmap;

public class MyHasMap implements MyMap{

    private int size; // quantity pairs
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    //koef of capacity - size/source.length >=LOAD_FACTOR - need to be rebalanced, to void long chains
    private Pair[] source = new Pair[INITIAL_CAPACITY]; //buckets
    private static class Pair {
        String key;
        String value;
        Pair next;

        public Pair(String key, String value, Pair next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    @Override
    public void put(String key, String value) {
        if (size > LOAD_FACTOR * source.length){
            resize();
        }
        Pair pair = findPair(key);
        if (pair == null){
            //insert pair before the pair in the bucket
            int bucket = findBucket(key);
            pair = new Pair(key, value, source[bucket]);
            source[bucket] = pair;
            size++;
        }
    }

    private int findBucket(String key){
        //find hash by key
        //find bucket by hash
        return Math.abs(key.hashCode()) % source.length;
    }

    private Pair findPair(String key){
        int bucket = findBucket(key);
        Pair currentPair = source[bucket];
        while (currentPair!=null){
            if (currentPair.key == key)
                return currentPair;
            currentPair = currentPair.next;
        }
        return null; // no pair
    }

    //rebalanced
    private void resize(){
        //new array times 2 source
        //all the elements in the source and put them into new array
        // INITIAL_CAPACITY = INITIAL_CAPACITY * 2;
        Pair newSource [] = new Pair [INITIAL_CAPACITY * 2];
        for (int i = 0; i < source.length; i++) {
            for (Pair p:source) {
                int bucket = Math.abs(p.key.hashCode()) % source.length;
                p.next = newSource[bucket];
                newSource[bucket] = p;
            }
        }
        source = newSource;
    }

    @Override
    public String get(String key) {
        Pair pair = findPair(key);
        if (pair != null)
            return pair.value;
        return null;
    }

    @Override
    public String remove(String key) {
        return null;
    }

    @Override
    public boolean contains(String key) {
        return (findPair(key) != null);
    }

    @Override
    public int size() {
        return size;
    }
}
