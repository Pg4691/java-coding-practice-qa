package collections.list;

import java.util.ArrayList;
import java.util.List;

// Problem: Count how many names in a list start with the letter "A".
public class CountNamesStartingWithA {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Rahul");
        names.add("Anjali");
        names.add("Priya");
        names.add("Arjun");

        int count = 0;

        for (String name : names) {
            if (name.startsWith("A")) {
                count++;
            }
        }

        System.out.println("Names starting with A: " + count);
    }
}
