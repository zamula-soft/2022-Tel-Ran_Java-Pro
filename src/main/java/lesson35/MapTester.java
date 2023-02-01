package lesson35;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapTester {
    public static void main(String[] args) throws InterruptedException {
//        Map<String, Integer> map = new HashMap<>();
        //hashmap не может использоваться в потоках -  не всегда 100

        //1 -й вар hastable
//        Map<String, Integer> map = new Hashtable<>();
        //hastable - slow

        //2- spec map - the quickest
        Map<String, Integer> map_ = new ConcurrentHashMap<>();
//        Vector - list для многопотока
//        Collections.synchronizedSet() for collections
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>()); // not quick not slow
        List<Integer> res = parallelAdd100(map, 100);
        System.out.println(res);

    }

    //key test -> 0
    //by key increase multithreading
    public static List<Integer> parallelAdd100(
            Map<String, Integer> m,
            int executionTimes
    ) throws InterruptedException {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < executionTimes; i++) {//100 times done multithreading
            m.put("test", 0);
            ExecutorService service = Executors.newFixedThreadPool(4);
            for (int j = 0; j < 10; j++) { //10 times run Execute
                service.execute( // Runnable like service.submit
                        () -> {
                            for (int k = 0; k < 10; k++) {
                                m.computeIfPresent( //10 times add 1 + previous value
                                        "test",
                                        (key, value) -> value + 1
                                );
                            }
                        }
                );
            }
            service.shutdown();
            service.awaitTermination(5, TimeUnit.SECONDS);
            result.add((m.get("test")));
        }
        return result;
    }
}
