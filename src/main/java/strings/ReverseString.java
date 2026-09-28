package strings;

// Problem: Reverse a string without using reverse() or StringBuilder.
public class ReverseString {

    static String reverse(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String result = reverse("automation");
        System.out.println(result);
    }
}
