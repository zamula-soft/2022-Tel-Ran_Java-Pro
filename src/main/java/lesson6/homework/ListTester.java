package lesson6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(1,2,3);
        List<Integer> c = Arrays.asList(4,2,3);

        System.out.println(compareLists(a,b));
        System.out.println(compareLists(b,c));

        System.out.println(compareListsNewList(a,b));
        System.out.println(compareListsNewList(c,b));

        List<String> s = Arrays.asList("Max", "Smith", "Tandy", "Roger", "Michael", "Alexander");
        System.out.println(findMinOrMax(s));

        List<String> s_new = new LinkedList(Arrays.asList("Max", "Smith", "Tandy", "Smith", "Roger", "Michael", "Michael", "Smith", "Alexander"));

        System.out.println(s_new);
        removeDuplicates(s_new);
        System.out.println(s_new);
    }

    public static boolean compareLists(List<Integer> a, List<Integer> b)
    {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(i))
                return false;
        }
        return true;
    }

    public static List<String> compareListsNewList(List<Integer> a, List<Integer> b)
    {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(i))
                res.add("No");
            else
                res.add("Yes");
        }
        return res;
    }

    public static String findMinOrMax(List<String> strings)
    {
        String minString = strings.get(0);;
        String maxString = strings.get(0);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() < minString.length()) {
                minString = s;
                minIndex = i;
            }
            else if (s.length() > maxString.length())
            {
                maxString = s;
                maxIndex = i;
            }

        }
        if (minIndex < maxIndex)
            return minString;
        return maxString;
    }

    public static void removeDuplicates(List<String> strings)
    {
        boolean needToDel = false;
        for (int i = 0; i < strings.size() ; i++)
        {

            for (int j = i+1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j)))
                {
                    needToDel = true;
                    break;
                }
            }
            if (needToDel == true){
                strings.remove(i);
                i--;
                needToDel = false;
            }
        }
    }
}
