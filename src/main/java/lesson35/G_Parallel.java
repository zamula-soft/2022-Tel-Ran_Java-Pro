package lesson35;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class G_Parallel {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()->"cruel");
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(()->"world");

        CompletableFuture<Void> combined =
                CompletableFuture.allOf(f1,f2,f2);

        combined.get();

        System.out.println(f1.get() + " "+ f2.get()+ " "+ f3.get());

    }



}
