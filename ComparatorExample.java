package Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pineapple");

        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Collections.sort(words, lengthComparator);
        System.out.println(words);
    }
}

