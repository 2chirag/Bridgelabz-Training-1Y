package com.gla.Assignment16.Lambda_Expression;
import java.util.*;
import java.util.function.*;
public class Main3 {
    public class Main3 {
        public static void main(String[] args) {
            List<String> alerts = Arrays.asList("Critical", "Normal", "Emergency");

            Predicate<String> filter = a -> a.equals("Critical") || a.equals("Emergency");

            alerts.stream()
                    .filter(filter)
                    .forEach(System.out::println);
        }
}
