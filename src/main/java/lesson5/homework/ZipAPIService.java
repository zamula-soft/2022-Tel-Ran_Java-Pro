package lesson5.homework;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ZipAPIService {
    @GET("{country}/{zip}") //для указания параметра
    Call<GetZipInfo> getZipInfo(@Path("country") String country, @Path("zip") String zip); //api.zippopotam.us/us/90210
}
