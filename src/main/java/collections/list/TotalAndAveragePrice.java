package collections.list;

import java.util.ArrayList;
import java.util.List;

// Problem: Find the total and average of all prices in a list.
public class TotalAndAveragePrice {

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(499);
        prices.add(1299);
        prices.add(99);
        prices.add(799);
        prices.add(250);

        int total = 0;

        for (int price : prices) {
            total = total + price;
        }

        double average = (double) total / prices.size();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
