package lesson34;

import lesson23.Rate;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lesson34 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // https://api.frankfurter.app/latest?amount=10&from=GBP&to=USD
        // get sum and call Request from USD to EUR
        // we call Request twice

        CompletableFuture<Rate> u =
                CompletableFuture.supplyAsync(() -> Request.getRate(100, "EUR", "TRY"))
                        .thenApplyAsync(rate -> Request.getRate(rate.rates.get("TRY"), "TRY", "USD"))
                        .handleAsync((rate, throwable) -> {
                            if (throwable!=null) System.out.println(throwable.getMessage());
                            return rate;
                        });


        //exception hadle
//        u.handle((rate, throwable) -> {
//            if (throwable != null)
//                System.out.println(throwable.getMessage());
//            return rate;
//        });
        System.out.println(u.get());

    }
}
