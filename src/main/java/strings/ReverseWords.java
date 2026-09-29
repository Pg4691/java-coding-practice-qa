package strings;

// Problem: Reverse the order of words in a sentence.
public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "Java Selenium Automation";

        String[] words = sentence.split("\\s+");

        StringBuilder s = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            s.append(words[i]);

            if (i != 0) {
                s.append(" ");
            }
        }

        System.out.println(s);
    }
}