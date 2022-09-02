package lesson5.json;

import com.google.gson.Gson;
import lesson4.lines.Point;

public class JsonTester {
    public static void main(String[] args) {
        //install gson maven JavaScript Object Notation
        //объект -> текст - сериализация serialization
        //текст -> объект - десириализация (парсинг)

        Point p = new Point(33, 44);

        Gson gson = new Gson();

        //serialization
        String s = gson.toJson(p);
        System.out.println(s);

        //deserialization
        String stringPoint = "{'x':10, 'y':20}";
        Point pp = gson.fromJson(stringPoint, Point.class);
        System.out.println(pp);
    }
}
