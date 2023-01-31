package lesson15.hashmap;

public class MyHasMap implements MyMap{

    private int size; // quantity pairs
    private static final int INITIAL_CAPACITY = 4;
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

        @Override
        public String toString() {
            return "{"+key+": "+value+"}";
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

    public int capacity(){
        return source.length;
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
        Pair newSource [] = new Pair [source.length * 2];

            for (Pair p:source) {
                Pair c = p;
                while (c!=null){
                    Pair n = c.next;
                    int bucket = Math.abs(c.key.hashCode()) % newSource.length;
                    c.next = newSource[bucket];
                    newSource[bucket] = c;
                    c = n;
                }
        }
        source = newSource;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("[");
        int s = size-1;
        for (Pair p:source) {
            Pair c = p;
            while (c!= null){
                b.append(c);
                if (--s>=0) b.append(", ");
                c = c.next;
            }
        }
        b.append("]");
            return b.toString();
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
        int bucket = findBucket(key);
        Pair c = source[bucket];
        if (c == null)
            return null;
        if (c.key.equals(key)){
            source[bucket] = c.next;
            size--;
            return c.value;
        }
        while (c.next != null){
            if (c.next.key.equals(key)){
                String res = c.next.value;
                c.next = c.next.next;
                return res;
            }
            c = c.next;

        }

        return null;
    }

    @Override
    public boolean contains(String key) {
        return findPair(key) != null;
    }

    @Override
    public int size() {
        return size;
    }
}
