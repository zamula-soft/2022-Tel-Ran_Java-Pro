package lesson12.homework;

import java.util.HashSet;
import java.util.Set;

public class SetsComparator {
    public static void main(String[] args) {

    }

    public static boolean checkSets (Set<String> s1, Set<String> s2){
        // s1 and s2 - is it the same object
        if (s1 == s2)
            return true;
        // 2 not null
        if (s1 == null || s2 == null)
            return false;
        // check size
        if (s1.size() != s2.size())
            return false;
        // all elements s1 in s2
//        for (String string: s1) {
//            if (!s2.contains(string))
//                return false;
//        }
        Set<String> temp_s3 = new HashSet<>(s1);
        temp_s3.removeAll(s2);
        return temp_s3.size() == 0;
    }

}
