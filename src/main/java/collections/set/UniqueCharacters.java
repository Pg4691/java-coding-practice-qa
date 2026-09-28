package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

// Problem: Print the unique characters of a word in the order they first appear.
public class UniqueCharacters {

    public static void main(String[] args) {
        String word = "programming";
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (int i = 0; i < word.length(); i++) {
            uniqueChars.add(word.charAt(i));
        }

        System.out.println(uniqueChars);
    }
}
