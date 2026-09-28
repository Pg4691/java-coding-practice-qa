package collections.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Problem: Remove duplicate order IDs from a list while keeping the original order.
public class RemoveDuplicateIds {

    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(101);
        ids.add(102);
        ids.add(101);
        ids.add(103);
        ids.add(102);
        ids.add(104);

        Set<Integer> uniqueIds = new LinkedHashSet<>(ids);

        System.out.println(uniqueIds);
    }
}
