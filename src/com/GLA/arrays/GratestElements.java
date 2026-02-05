package com.GLA.arrays;
import java.util.*;
public class GratestElements {
    public static void main(String args[]){
        int a[]= {2,3,4,5};
        int max=0;
        for (int i =0 ;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
