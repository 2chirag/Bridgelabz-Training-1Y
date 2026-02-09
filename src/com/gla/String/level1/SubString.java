package com.gla.String.level1;
import java.util.Scanner;

public class SubString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String text = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();

            String custom = "";

            for (int i = start; i < end; i++) {
                custom = custom + text.charAt(i);
            }

            String builtIn = text.substring(start, end);

            int same = 1;

            if (custom.length() != builtIn.length()) {
                same = 0;
            } else {
                for (int i = 0; i < custom.length(); i++) {
                    if (custom.charAt(i) != builtIn.charAt(i)) {
                        same = 0;
                        break;
                    }
                }
            }

            System.out.println("Same substring: " + (same == 1));
            sc.close();
        }

}
