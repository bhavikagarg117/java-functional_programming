package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredNCon {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = n -> n % 2 ==0;
        Consumer<Integer> num = n -> System.out.println(n*2);
        for (Integer n : numbers) {
                    if (isEven.test(n)) {
                        num.accept(n);
                    }
        }
    }
}

