package collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Problem: Print the order IDs that appear on both days.
public class CommonOrderIds {

    public static void main(String[] args) {

        Set<Integer> yesterday = new HashSet<>(List.of(101, 102, 103, 104));

        Set<Integer> today = new HashSet<>(List.of(103, 104, 105));

        Set<Integer> commonIds = new HashSet<>(today);
        commonIds.retainAll(yesterday);

        System.out.println(commonIds);
    }
}
