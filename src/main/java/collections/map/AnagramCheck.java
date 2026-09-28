package collections.map;

import java.util.HashMap;
import java.util.Map;

// Problem: Check whether two words are anagrams (same letters, same counts, different order).
public class AnagramCheck {

    // Counts each character in a word and returns the counts as a Map
    static Map<Character, Integer> countChars(String word) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        return counts;
    }

    // Returns true if both words are anagrams, ignoring capital letters
    static boolean isAnagram(String word1, String word2) {
        String first = word1.toLowerCase();
        String second = word2.toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        return countChars(first).equals(countChars(second));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("test", "tent"));       // false
        System.out.println(isAnagram("Listen", "Silent"));   // true
    }
}

//
//import java.util.Arrays;
//
//        char[] a = "listen".toCharArray();
//        char[] b = "silent".toCharArray();
//
//Arrays.sort(a);
//Arrays.sort(b);
//
//System.out.println(Arrays.equals(a, b));