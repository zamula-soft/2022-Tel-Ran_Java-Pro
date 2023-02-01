package lesson35;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class A_CompletableFeature {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Void = no returns
        CompletableFuture<Void> future = CompletableFuture.runAsync( //run runnable on child thread no results just run
                () -> {
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("thread "+ Thread.currentThread().getId());


                }
        );
         future.get(); // block in the current thread and wait for result on main thread
        System.out.println("main "+ Thread.currentThread().getId());

        //return value in parallel child thread and return computed value
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("supply " + Thread.currentThread().getId());
                    return "How are you?";
                }
        ).thenApply(
                s -> s + " I'm fine"
        )
                ;
        System.out.println(cf.get());

        //using
        CompletableFuture.supplyAsync(
                () ->"Hello"
        ).thenAccept(s-> System.out.println(s));
    }
}
