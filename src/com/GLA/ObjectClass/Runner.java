package com.GLA.ObjectClass;

public class Runner {
    public static void main(String[] args){
        Calculator c = new Calculator();
        int sum1 =c.add(12,13);
        System.out.println(sum1);
        double sum2 =c.add(11.23,12.34);
        System.out.println(sum2);
    }
}
