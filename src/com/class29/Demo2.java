package com.class29;

import Repl.A;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        for(int element:array){
            if (element==10){
                System.out.println("Found");
            }
        }

        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        //arrayList.add("10");
        System.out.println(arrayList.contains(10));
    }
}
