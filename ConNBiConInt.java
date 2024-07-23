package Functional_Programming;

import java.util.function.*;

public class ConNBiConInt {
    public static void main(String[] args) {
        Consumer<String> obj1= n -> System.out.println(n+n);
        obj1.accept("hello");

        BiConsumer<Integer,String> obj= (id,name)-> System.out.println("My id is "+id+" and name is "+name);
        obj.accept(101,"Bob");
    }
}
