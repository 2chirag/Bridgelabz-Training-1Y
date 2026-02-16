package com.GLA.level1;
import java.util.Scanner;

public class Division {
        public static int[]RemainderAndQuotient(int n,int d){
            return new int[]{n/d,n%d};
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[]r=RemainderAndQuotient(n,d);
            System.out.println("Quotient "+r[0]+" Remainder "+r[1]);
        }

}
