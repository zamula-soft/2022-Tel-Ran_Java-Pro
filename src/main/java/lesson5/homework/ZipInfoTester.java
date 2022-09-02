package lesson5.homework;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ZipInfoTester {
    public static void main(String[] args) throws IOException {
//Zip code information
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.zippopotam.us/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ZipAPIService service = retrofit.create(ZipAPIService.class);
        Call<GetZipInfo> call = service.getZipInfo("us", "90210");
        Response<GetZipInfo> response = call.execute();

        if (response.isSuccessful())
        {
            GetZipInfo getZipInfo = response.body();
            System.out.println(response.body());
        }
        System.exit(0);
    }
}
