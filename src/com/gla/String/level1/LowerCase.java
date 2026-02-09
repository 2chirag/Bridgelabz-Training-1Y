package com.gla.String.level1;
import java.util.Scanner;

public class LowerCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            String custom = "";

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }
                custom += ch;
            }

            String builtIn = text.toLowerCase();
            System.out.println(custom.equals(builtIn));

            sc.close();
        }

}
