package lesson5.anime;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
//https://anime-facts-rest-api.herokuapp.com
public interface AnimeService {
    @GET("api/v1/{anime}")
    Call<Anime> getAnime(@Path("anime") String name);

}
