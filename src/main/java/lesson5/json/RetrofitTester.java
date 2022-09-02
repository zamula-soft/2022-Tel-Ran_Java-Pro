package lesson5.json;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class RetrofitTester {
    public static void main(String[] args) throws IOException { //main выбрасывает исключения
        Retrofit retrofit = new Retrofit.Builder() //билдер используется для настрокий ретрофита
                //builder - строитель шаблон для создания класса
                .baseUrl("https://api.country.is/")
                .addConverterFactory(GsonConverterFactory.create()) // для преобразования
                // и автоматического создания объекта по json
                .build(); //говорим билд для создания объекта класса ретрофит с выбранными настройками

        //просим ретрофит создать нам реализацию интерфейса
        //которая сможет выполнят http запросы
        GeoCoderService service = retrofit.create(GeoCoderService.class); //создание экз класса по интерфейсу

        //передача запроса на вебсервис - возвратит GeoCode
        //Call - из библиотеки ретрофита
        Call <GeoCode> call = service.getGeoCode("62.210.127.111"); //dns "8.8.4.4" service google //call - сам запрос

        //результат запроса
        Response<GeoCode> response = call.execute(); //1 вариант - синхронный запрос (ждем результат)
        //call.enqueue();                            //2-й вариант асинхронный запрос

        if (response.isSuccessful()) //удачный результат запроса
        {
            GeoCode geoCode = response.body(); //объект, представляющие собой содержание запрос
            System.out.println("country "+geoCode.getCountry()+ " ip "+ geoCode.getIp());
        }
        System.exit(0); //для завершения ретрофита закрываем приложение, так как ретрофит запускает отдельный поток


    }
}
