package lesson5.arrays;

import java.util.Arrays;

public class ArraysTester {
    public static void main(String[] args) {
        //working wth arrays binary search sort
        //init
        int [] a = new int[]{1,2,5,7};
        String[] b = {"Apocalypse now", "Taxi Driver", "Psycho"};
        double[] c = new double[10]; // 0 все примитив типы кроме boolean - false
        //ссылочные типы - null по умолчанию
        //  длина
        System.out.println(b.length);
        //обращ по индекму
        System.out.println(b[1]);
        //изм по инд
        b[2] = "Hateful eight";
        //массив не изменяется по размеру

        //ОПЕРАЦИИ
        //сортировка
        Arrays.sort(b); //функция сама выьирает алгоритм взамисимости от размера и типа
        //можно указать алгоритм сортировки
        System.out.println(Arrays.toString(b));
        //сортировка компоратором

        //binarySearch O(NlogN)
        // только на сортированом массиве
        //0 1 2  3  4  5  6
        //1 4 13 33 37 41 50
        int [] r = {1, 4, 13, 33, 37, 41, 50};
        System.out.println(
                Arrays.binarySearch(r, 41) //5
        );
        System.out.println(
                Arrays.binarySearch(r, 2)  //-2
        );
        //-2 = -insertion point -1
        //insertion point = 1
    }
}
