package lesson5.animals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/*
https://cat-fact.herokuapp.com/
    facts/random/
        ?animal_type=dog&amount=2
*/
public interface AnimalService {

    @GET("facts/random") //Query  ? и & автоматически добавляются
    Call<List<Fact>> getFacts(  //List потому, что несколько ответов
            @Query("animal_type") String animal,
            @Query("amount") int number
    );

    @GET("facts/random")
    Call<Fact> getFact();

}
