package com.gla.Array.LEVEL2;
import java.util.Scanner;

public class DigitFrequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int temp = number;
            int count = 0;

            // Count digits
            while (temp != 0) {
                count++;
                temp /= 10;
            }

            // Store digits in array
            int[] digits = new int[count];
            int index = 0;

            while (number != 0) {
                digits[index++] = number % 10;
                number /= 10;
            }

            // Frequency array (0–9)
            int[] freq = new int[10];

            for (int i = 0; i < digits.length; i++) {
                freq[digits[i]]++;
            }

            // Display frequency
            System.out.println("Digit Frequency:");
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
                }
            }

            sc.close();
        }

}
