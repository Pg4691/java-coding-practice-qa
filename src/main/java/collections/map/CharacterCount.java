package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

// Problem: Count how many times each character appears in a word, keeping insertion order.
public class CharacterCount {

    public static void main(String[] args) {
        String word = "automation";
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        System.out.println(counts);
    }
}
