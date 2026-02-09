package com.gla.String.level1;
import java.util.Scanner;

public class StringIndex {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String text = sc.next();
            System.out.println(text.charAt(text.length())); // Invalid index

            sc.close();
        }

}
