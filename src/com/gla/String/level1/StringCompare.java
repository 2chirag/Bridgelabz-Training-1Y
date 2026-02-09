package com.gla.String.level1;
import java.util.Scanner;

public class StringCompare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s1 = sc.next();
            String s2 = sc.next();

            int flag = 1;

            if (s1.length() != s2.length()) {
                flag = 0;
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        flag = 0;
                        break;
                    }
                }
            }

            System.out.println("Using charAt(): " + (flag == 1));
            System.out.println("Using equals(): " + s1.equals(s2));

            sc.close();
        }

}
