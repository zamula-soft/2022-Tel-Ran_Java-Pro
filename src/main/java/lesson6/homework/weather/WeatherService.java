package lesson6.homework.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("v1/forecast") //сервис
    Call <Weather> getWeather(
            @Query("latitude") double lat,
            @Query("longitude") double lon,
            @Query("hourly") String hourly
    );


}
