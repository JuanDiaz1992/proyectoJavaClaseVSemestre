package com.javaProject.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOdd {
    private int[] list;


    public RemoveOdd(int[] list){
        this.list = list;
    }
    public void runProgram(){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i]%2 == 0){
                newList.add(this.list[i]);
            }
        }
        System.out.println("Lista original: " + Arrays.toString(this.list));
        System.out.println("Lista sin impares: "+ newList);
    }
}
