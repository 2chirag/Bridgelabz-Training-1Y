package com.GLA.arrays;
import java.util.*;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//      printing
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
