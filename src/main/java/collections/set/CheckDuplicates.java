package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Problem: Check whether a list contains any duplicates by comparing it with a Set.
public class CheckDuplicates {

    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(101);
        ids.add(102);
        ids.add(101);
        ids.add(103);
        ids.add(102);
        ids.add(104);

        Set<Integer> uniqueIds = new HashSet<>(ids);

        if (ids.size() == uniqueIds.size()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates found");
        }
    }
}
