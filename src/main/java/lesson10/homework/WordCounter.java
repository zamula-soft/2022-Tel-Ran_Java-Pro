package lesson10.homework;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String toCount = "one two three two one One one";
        wordCounter(toCount);

    }

    public static void wordCounter(String s) {
        Set<Word> words = new HashSet<>();
        s = s.toLowerCase();

        for (String a : s.split(" ")) {

            Word searchWord = new Word(a);
            if (words.contains(searchWord)) {
                searchWord = findWord(words, searchWord);
            }
            searchWord.count++;
            words.add(searchWord);
        }

        for (Word www: words){
            System.out.println(www);
        }

    }

    //findWords - in fact search by key
    private static Word findWord(Set<Word> words, Word searchWord) {
        for (Word ww: words)
        {
            if (ww.equals(searchWord))
                return ww;
        }
        return null;
    }


    public static class Word {
        public String key;
        public int count = 0;

        @Override
        public String toString() {
            return key + ':' + count;
        }

        public Word(String key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Word word = (Word) o;
            return Objects.equals(key, word.key);
        }

        @Override
        public int hashCode() {
            int result = key != null ? key.hashCode() : 0;
            return result;
        }
    }

}
