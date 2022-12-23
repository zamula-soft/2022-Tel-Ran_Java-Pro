package lesson13.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DigitTester {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,1,2,8,8,1,8,1,8,2,2,12));
        filterList(list);
        System.out.println(list);

    }

    public static void filterList (List<Integer> list){
        List<Integer> internal = new ArrayList<>(list);
        Collections.sort(internal);

        int prev = internal.get(0);
        int counter = 0;
        for (int i = 0; i < internal.size(); i++) {
            int current = internal.get(i);
            if (prev == current)
                counter++;
            else
            {
                if (counter % 2 == 1) {
                    list.removeAll((Arrays.asList(prev)));
                }
                counter = 1;
            }
            prev = current;

        }
        if (counter % 2 == 1) {
            list.removeAll((Arrays.asList(prev)));
        }
    }
}
