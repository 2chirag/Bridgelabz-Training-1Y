package com.GLA.multithreading;

public class Thread4 implements Runnable{
    for(int i=9;i>=1;i--)

    {
        System.out.println("Thread4 :" + i);
    }
    try {
            Thread.sleep(1000);
        }
    catch (Exception e) {
            System.out.println(e.getMessage());

    }
}
