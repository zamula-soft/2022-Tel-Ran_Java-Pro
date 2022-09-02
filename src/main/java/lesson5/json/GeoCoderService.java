package lesson5.json;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GeoCoderService {
    @GET("{ip}") //для указания параметра
    Call<GeoCode> getGeoCode(@Path("ip") String ip); //GET https://..../ip

    /*
    @GET("{country}{ip}") //для указания параметра
    Call<GeoCode> getGeoCode(@Path("ip") String ip, @Path("country") String c); //GET https://..../ip
     */
}
