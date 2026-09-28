package collections.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Problem: Find the product that appears most often, and its count.
public class MostFrequentProduct {

    public static void main(String[] args) {
        List<String> products = List.of("Shirt", "Cap", "Shirt", "Shoes", "Cap", "Shirt");

        // Step 1: count each product (ignoring capital letters)
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String product : products) {
            String key = product.toLowerCase();
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }

        // Step 2: find the product with the highest count
        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent: " + mostFrequent + " (" + maxCount + ")");
    }
}