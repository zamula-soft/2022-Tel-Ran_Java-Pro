package lesson34;

import com.google.gson.Gson;
import lesson23.Rate;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {
    //https://api.fdrankfurter.app/latest?amount=10&from=GBP&to=USD
    public static Rate getRate(double amount, String from, String to)
    {
        Rate result = null;
        Gson gson = new Gson();
        try {
            URL url = new URL("https://api.frankfurter.app/latest?amount="+amount+"&from="+from+"&to="+to);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // conn
            System.out.println("get rate encode" + connection.getContentEncoding());
            System.out.println("get rate content" + connection.getContentType());
            Reader reader = new InputStreamReader(connection.getInputStream()); //read input stream from byte to symbols
            result = gson.fromJson(reader, Rate.class); // serialize into Rate class
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return result;

    }
}
