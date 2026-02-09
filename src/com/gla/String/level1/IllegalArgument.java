package com.gla.String.level1;
import java.util.Scanner;

public class IllegalArgument {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String text = sc.next();
            System.out.println(text.substring(5, 2)); // start > end

            sc.close();
        }

}
