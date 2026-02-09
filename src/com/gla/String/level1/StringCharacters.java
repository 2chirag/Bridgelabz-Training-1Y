package com.gla.String.level1;
import java.util.Scanner;

public class StringCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String text = sc.next();

            char[] arr1 = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                arr1[i] = text.charAt(i);
            }

            char[] arr2 = text.toCharArray();

            int same = 1;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    same = 0;
                    break;
                }
            }

            System.out.println("Arrays same: " + (same == 1));
            sc.close();
        }

}
