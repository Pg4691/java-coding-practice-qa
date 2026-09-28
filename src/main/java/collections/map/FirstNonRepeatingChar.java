package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

// Problem: Find the first non-repeating character in a string.
public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String word = "swiss";
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        boolean found = false;

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }
    }
}
