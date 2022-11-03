package lesson10.homework;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {

        String string1 = "Website texts are texts that are created especially for use on the Internet. " +
                "Text is the most important part of most websites – " +
                "even ahead of other formats such as image and video. " +
                "Various features distinguish website texts from other types of texts. " +
                "These include a specific HTML design and search engine optimization."
                ;

        System.out.println(countWords(string1));


    }// main

    static class Result{
        String word;
        int quantity = 0;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Result result = (Result) o;
            return Objects.equals(word, result.word);
        }

        @Override
        public int hashCode() {
            int result = word != null ? word.hashCode() : 0;
            result = 31 * result;
            return result;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "word ='" + word + '\'' +
                    ", quantity =" + quantity +
                    '}';
        }
    }

    public static Collection<Result> countWords(String string)
    {
        String[] words = string.split("\\W+");
        Set<Result> res = new HashSet<>();
        for (String word: words)
        {

            Result r = new Result();
            r.word = word;

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
            r.quantity+=1;
            res.add(r);
        }
        return res;
    }


}
