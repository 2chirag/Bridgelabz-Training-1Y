package com.gla.String.level1;
import java.util.Scanner;

public class NumberFormat {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String text = sc.next();
            int num = Integer.parseInt(text); // Non-number input

            System.out.println(num);
            sc.close();
        }

}
