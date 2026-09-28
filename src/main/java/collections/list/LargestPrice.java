package collections.list;

import java.util.ArrayList;
import java.util.List;

// Problem: Find the largest price in a list without using sort() or max().
public class LargestPrice {

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(499);
        prices.add(1299);
        prices.add(99);
        prices.add(799);
        prices.add(250);

        int max = prices.get(0);

        for (int price : prices) {
            if (price > max) {
                max = price;
            }
        }

        System.out.println("Largest price: " + max);
    }
}
