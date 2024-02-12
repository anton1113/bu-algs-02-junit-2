package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesRemover {

    public static void main(String[] args) {
        DuplicatesRemover remover = new DuplicatesRemover();
        Object[] array = {"a", "a", "b", "c", "c"};
        Object[] unique = remover.removeDuplicates(array);
        System.out.println(Arrays.toString(unique));
    }

    Object[] removeDuplicates(Object[] array) {
        if (array == null) {
            return null;
        }
        List<Object> uniqueItems = new ArrayList<>();
        for (Object elem: array) {
            if (!uniqueItems.contains(elem)) {
                uniqueItems.add(elem);
            }
        }
        return uniqueItems.toArray(new Object[0]);
    }
}
