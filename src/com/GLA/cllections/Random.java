package com.GLA.cllections;

public class Random {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(45);
        set.add(50);
        set.add(18);
        set.add(18);
        set.add(15);
        set.add(9);

        System.out.println(set);
        set.remove(15);
        System.out.println(set);
        System.out.println(set.contains);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        for(int val :set){
            System.out.println(val+" ");
        }
        Iterator it = set.Iterator();
        while(it.hasNaxt()){
            System.out.println(it.next());
        }

    }
}
