package collections.list;

import java.util.ArrayList;
import java.util.List;

// Problem: Reverse a list manually without using Collections.reverse().
public class ReverseList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Rahul");
        names.add("Anjali");
        names.add("Priya");
        names.add("Arjun");

        List<String> reversed = new ArrayList<>();

        for (int i = names.size() - 1; i >= 0; i--) {
            reversed.add(names.get(i));
        }

        System.out.println("Original: " + names);
        System.out.println("Reversed: " + reversed);
    }
}
