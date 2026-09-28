package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Problem: Remove all negative numbers from a list using an Iterator
public class RemoveNegatives {

    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>();

        numbers.add(5);
        numbers.add(-3);
        numbers.add(8);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(7);

        Iterator<Integer>it = numbers.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num < 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
