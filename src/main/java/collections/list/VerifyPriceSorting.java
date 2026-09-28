package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Problem: Verify that prices shown after a "Low to High" filter are sorted correctly.
public class VerifyPriceSorting {

    public static void main(String[] args) {

        List<Integer> actual = new ArrayList<>(List.of(99, 299, 499, 450, 999));

        List<Integer> expected = new ArrayList<>(actual);   // copy, never sort the original
        Collections.sort(expected);

        if (actual.equals(expected)) {
            System.out.println("Prices are sorted correctly");
        } else {
            System.out.println("Not sorted:");

            for (int i = 0; i < actual.size(); i++) {
                if (!actual.get(i).equals(expected.get(i))) {
                    System.out.println("Position " + (i + 1) + ": expected "
                            + expected.get(i) + ", found " + actual.get(i));
                }
            }
        }
    }
}