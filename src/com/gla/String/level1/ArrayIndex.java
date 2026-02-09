package com.gla.String.level1;
import java.util.Scanner;

public class ArrayIndex {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] names = new String[3];
            for (int i = 0; i < 3; i++) {
                names[i] = sc.next();
            }

            System.out.println(names[3]); // Invalid index
            sc.close();
        }

}
