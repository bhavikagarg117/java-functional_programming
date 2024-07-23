package Functional_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInt {
    public static void main(String[] args) {
        Supplier<String> o1= ()-> "Default Message";
        System.out.println(o1.get()+"\n---------------------------");

        Supplier<List> o2= ()-> new ArrayList<Integer>();
        List<Integer> list1= o2.get();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);






    }
}
