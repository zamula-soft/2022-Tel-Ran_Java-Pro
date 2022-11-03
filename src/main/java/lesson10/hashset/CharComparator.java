package lesson10.hashset;

import java.util.Comparator;

public class CharComparator implements Comparator<Character>
{

    @Override
    public int compare(Character o1, Character o2) {
        return o1 - o2;
    }
}
