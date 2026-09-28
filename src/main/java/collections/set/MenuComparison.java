package collections.set;

import java.util.HashSet;
import java.util.Set;

// Problem: Compare expected and actual menu items to find missing and extra items.
public class MenuComparison {

    public static void main(String[] args) {
        Set<String> expectedMenu = new HashSet<>();
        expectedMenu.add("Home");
        expectedMenu.add("Shop");
        expectedMenu.add("Offers");
        expectedMenu.add("Cart");
        expectedMenu.add("Account");

        Set<String> foundMenu = new HashSet<>();
        foundMenu.add("Home");
        foundMenu.add("Shop");
        foundMenu.add("Cart");
        foundMenu.add("Blog");
        foundMenu.add("Account");

        Set<String> missing = new HashSet<>(expectedMenu);
        missing.removeAll(foundMenu);

        Set<String> extra = new HashSet<>(foundMenu);
        extra.removeAll(expectedMenu);

        System.out.println("Missing: " + missing);
        System.out.println("Extra: " + extra);
    }
}
