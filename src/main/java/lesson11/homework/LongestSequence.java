package lesson11.homework;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LongestSequence {
    public static void main(String[] args) {
        //the longest sequence
        List<Integer> i = new ArrayList<>(Arrays.asList(1,2,3,4,6,5,6,7,6,4,2,0));
        System.out.println(getLongestEvenSequence(i));

    }

    public static Collection<Integer> getLongestEvenSequence(List<Integer> l)
    {
        List<Integer> result = new ArrayList<>(); // current max
        List<Integer> cur_arr = new ArrayList<>(); // cur arr
        for (Integer i: l) {
            // if even, add to cur_arr
            if (i % 2 == 0) {
                cur_arr.add(i);
            }
            //else - check the len of cur_arr - if more than result - move to result
            //clear cur_arr
            else{
                if (cur_arr.size() > result.size())
                {
                    result.clear();
                    result.addAll(cur_arr);
                }
                cur_arr.clear();
            }
        }
        if (cur_arr.size() > result.size())
            return cur_arr;

        return result;
    }
}
