package com.GLA.exception;
public class AgeChecker {
    static void agechecker(int age){
        if(age<18){
            throw new ArithmeticException("invalid age for voting");
        }
        System.out.println("Valid age");
    }
    static void main (String[] args){
        agechecker(100);
    }
}