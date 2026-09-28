package collections.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Problem: List products priced under 1000 and find the most expensive product.
public class ProductPriceAnalysis {

    public static void main(String[] args) {
        Map<String, Integer> prices = new LinkedHashMap<>();
        prices.put("Shirt", 799);
        prices.put("Shoes", 2499);
        prices.put("Cap", 299);
        prices.put("Watch", 1599);

        List<String> under1000 = new ArrayList<>();
        String maxProduct = "";
        int maxPrice = 0;

        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            String product = entry.getKey();
            int price = entry.getValue();

            if (price < 1000) {
                under1000.add(product);
            }

            if (price > maxPrice) {
                maxPrice = price;
                maxProduct = product;
            }
        }

        System.out.println("Under 1000: " + String.join(", ", under1000));
        System.out.println("Most expensive: " + maxProduct + " (" + maxPrice + ")");
    }
}
