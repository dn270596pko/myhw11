package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Mary", "Peter", "Ann"));
        String indexedNames = getIndexedNames(names);
        System.out.println(indexedNames);
    }

    public static String getIndexedNames(List<String> names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.size(); i += 2) {
            int index = i + 1;
            sb.append(index).append(". ").append(names.get(i));
            if (i < names.size() - 2) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
