package dev.alex.hello.functional;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionalJava {

    public static void main(String[] args) {

        //higher-order function
        Comparator<String> comparatorReversed = Comparator.<String>naturalOrder().reversed();

        var names = Arrays.asList("alex", "dev");
        System.out.println("Before sorting: " + names);
        names.sort(comparatorReversed);
        System.out.println("After sorting: " + names);

        //pure function
        var age = Math.sqrt(64);
        System.out.println(age);
    }
}
