package lesson23;

import java.util.HashMap;
import java.util.Map;

public class Rate {
    @Override
    public String toString() {
        return "Rate{" +
                "amount=" + amount +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }

    public double amount;
    public String base;
    public String date;

    public Map<String, Double> rates = new HashMap<>();
//    {"amount":10 rates:{USD:11}}
}
