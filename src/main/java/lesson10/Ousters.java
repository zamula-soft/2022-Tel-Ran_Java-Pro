package lesson10;

import java.util.*;

//Realization interface with only ony method called as Architecture Sample "Command"
//SAM interface - single access method - interface with thr only one function
interface Filter {
    boolean criteria (String string);

}

class MyFilter implements Filter {

    @Override
    public boolean criteria(String string) {

        return string.toUpperCase().contains("R");

    }

}

public class Ousters {
    public static void main(String[] args) {

        String [] month = new String[] {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        Collection<String> result = filter(
                //new MyFilter(), - the first way
//                //the second way
//                new Filter() { // anonymous inside class
//                    @Override
//                    public boolean criteria(String string) {
//                        return string.toUpperCase().contains("R");
//                    }
//                },
                //the third Lambda expressions
                string -> string.toUpperCase().contains("R"),
        new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December")));

        System.out.println(result);
    }

    public static Collection<String> filter (Filter f, Collection<String> strings)
    {
        List<String> ret = new ArrayList<>();

        for(String s: strings){ //for all strings in collection
            if (f.criteria((s))) //condition in Filter
                ret.add(s); //adding to result collection
        }

        return ret;
    }

}
