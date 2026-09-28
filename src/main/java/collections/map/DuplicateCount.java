package collections.map;

import java.util.HashMap;
import java.util.Map;

// Problem: Print each duplicate number in an array along with how many times it appears.
public class DuplicateCount {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4, 4};
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}
