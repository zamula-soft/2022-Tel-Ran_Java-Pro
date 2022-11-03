package lesson10.hashset;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class SetPractise {
    public static void main(String[] args) {

        String s = "Hello world!";
        System.out.println(getUniqueChars(s));
        System.out.println(getUniqueCharsOnLesson(s));
        System.out.println(getUniqueSortedChars(s.toUpperCase()));

        //Sorting through arrays
        Collection<Character> result = getUniqueCharsOnLesson(s);
        Character[] chars = new Character[result.size()];
        result.toArray(chars);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        //Sorting through Collection sort + Comparator
        List<Character> list = new ArrayList<>(getUniqueCharsOnLesson(s));
        Collections.sort(list, new CharComparator());

        System.out.println(getResult(s));


    } //main


    //function to get string and return positions of every char in string
    // To create we need a new structure class
    static class Result{
        Character c;
        List<Integer> positions = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result result = (Result) o;
            return Objects.equals(c, result.c);
        }

        @Override
        public int hashCode() {
            return c;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "c=" + c +
                    ", positions=" + positions +
                    '}';
        }
    }

    public static Collection<Result> getResult (String s){
        Set<Result> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            Result r = new Result();
            r.c = c;

            if (res.contains(r))
            {
                Iterator<Result> resultIterator = res.iterator();
                while (resultIterator.hasNext())
                {
                    Result current = resultIterator.next();
                    if (current.equals(r))
                    {
                        r = current;
                        break;
                    }
                }
            }
            r.positions.add(i);
            res.add(r);
        }
    return res;
    }

    public static Collection<Character> getUniqueChars(String s){
        Collection<Character> result = new LinkedHashSet<>();
        for(int i = 0; i<s.length(); i++)
        {
            Character c = s.charAt(i);
            if (!result.contains(c))
                result.add(c);
        }
        return result;
    }

    public static Collection<Character> getUniqueCharsOnLesson(String string){
        Set<Character> chars = new LinkedHashSet<>(); //Set itself checks unique values
        for (char c: string.toCharArray()){
            chars.add(c);
        }
        return chars;
    }

    public static Collection<Character> getUniqueSortedChars(String string){
        Set<Character> chars = new TreeSet<>(); //Use tree to set order
        for (char c: string.toCharArray()){
            chars.add(c);
        }
        return chars;
    }
}
