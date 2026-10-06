package programs;

// Problem: Reverse a number using % and /, and check if it's a palindrome.
public class ReverseNumber {

    public static void main(String[] args) {

        // 1. Store the number
        int num = 12345;

        // 2. Save a copy of the original (the loop will change num to 0)
        int original = num;

        // 3. Create reversed, starting at 0
        int reversed = 0;

        // 4. Loop while there are digits left
        while (num > 0) {

            // 5. Get the last digit
            int digit = num % 10;

            // 6. Add it to the end of reversed
            reversed = reversed * 10 + digit;

            // 7. Remove the last digit from num
            num = num / 10;
        }

        // 8. Print the reversed number
        System.out.println("Reversed: " + reversed);

        // 9. Compare with the original copy
        if (reversed == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        // Second approach: convert to String and reverse
        String text = String.valueOf(original);
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("String approach - palindrome? " + text.equals(reversedText));
    }
}