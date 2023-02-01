package lesson35;

import java.util.Random;
import java.util.concurrent.*;

public class F_FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service1 = Executors.newFixedThreadPool(2);
        ExecutorService service2 = Executors.newSingleThreadExecutor();

        CompletableFuture<String> cf = CompletableFuture
                .supplyAsync(() -> calcOne(), service1)
                .thenApplyAsync(i-> greeting(i), service2);

        System.out.println(cf.get());
        service1.shutdown();
        service1.shutdown();

    }

    public static int calcOne(){
        return new Random().nextInt();
    }

    public static String greeting(int i){
        return "Hello " + i;
    }
}
