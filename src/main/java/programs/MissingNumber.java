package programs;

// Problem: Find the missing number in an array containing 1 to n with one number missing.
public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 5, 6};


        int n = nums.length + 1;
        int total = n * (n + 1) / 2;


        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }


        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}