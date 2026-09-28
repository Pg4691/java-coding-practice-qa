package collections.list;

import java.util.ArrayList;
import java.util.List;

// Problem: Find a product in search results and print its 1-based position, or "Not found".
public class FindProductPosition {

    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        results.add("iPhone 15");
        results.add("Samsung S24");
        results.add("OnePlus 12");
        results.add("Pixel 9");

        boolean found = false;

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).equals("OnePlus 12")) {
                System.out.println("Found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
