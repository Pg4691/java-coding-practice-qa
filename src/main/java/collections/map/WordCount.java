package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

// Problem: Count how many times each word appears in a sentence.
public class WordCount {

    public static void main(String[] args) {
        String sentence = "test the app and test the api";
        String[] words = sentence.toLowerCase().split("\\s+");

        Map<String, Integer> count = new LinkedHashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count);
    }
}
