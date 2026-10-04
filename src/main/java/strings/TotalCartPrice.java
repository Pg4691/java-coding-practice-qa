package strings;

import java.util.List;

// Problem: Convert cart price texts like "₹1,299" to numbers and print the total.
public class TotalCartPrice {

    public static void main(String[] args) {


        List<String> prices = List.of("₹499", "₹1,299", "₹99", "₹2,49,999");

        int total = 0;

        for (String priceText : prices) {


            String cleaned = priceText.replace("₹", "").replace(",", "");

            int price = Integer.parseInt(cleaned);


            total = total + price;
        }

        // 7. After the loop, print the total
        System.out.println("Total: " + total);
    }
}