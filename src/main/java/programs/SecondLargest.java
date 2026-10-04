package programs;


// Problem: FInd second-largest number
public class SecondLargest {

    public static void main(String[] args) {

        int [] nums = {499, 1299, 99, 799, 250};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > max) {
                secondMax = max;
                max = num;
            }

            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println("Second largest: " + secondMax);
        }

    }
}
