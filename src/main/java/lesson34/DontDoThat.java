package lesson34;

import lesson23.Rate;

public class DontDoThat {
    // you must not do that - no exception management!!!
    // increase geometry exceptions - > use completable future instead of this
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                Rate rate = Request.getRate(10, "GBP", "USD");
                startNewThread(rate);
            }
        }.start();
    }

    private static void startNewThread(Rate rate) {
        new Thread(){
            @Override
            public void run() {
                Rate rate1 = Request.getRate(rate.rates.get("USD"), "USD", "EUR");
                finish(rate1);
            }
        }.start();
    }

    private static void finish(Rate rate){
        System.out.println(rate);
    }

}
