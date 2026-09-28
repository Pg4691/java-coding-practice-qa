package collections.set;

import java.util.HashSet;
import java.util.Set;

// Problem: Find duplicate numbers in an array and print each duplicate only once.
public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4, 4};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
