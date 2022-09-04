package lesson5.animals;

import lesson5.homework.GetZipInfo;
import lesson5.homework.ZipAPIService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class AnimalTester {
    public static void main(String[] args) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cat-fact.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimalService service = retrofit.create(AnimalService.class);

        Call<List<Fact>> call = service.getFacts("cat", 3);
        Response<List<Fact>> response = call.execute();


        if (response.isSuccessful())
        {
            List<Fact> facts = response.body();
            for(Fact f: facts) {
                System.out.println(f.getText());
            }

        }

        Call<Fact> call1 = service.getFact();
        Response<Fact> response1 = call1.execute();
        if(response1.isSuccessful()){
            Fact fact = response1.body();
            System.out.println(fact.getText());
        }
        System.exit(0);
    }

    }

