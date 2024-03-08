package com.javaProject.controlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOdd {
    private int[] list;


    public RemoveOdd(int[] list){
        this.list = list;
    }
    public String runProgram(){
        List<Integer> newList = new ArrayList<>();
        boolean isOdd = false;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i]%2 == 0){
                newList.add(this.list[i]);

            }else{
                isOdd = true;
            }
        }
        if (isOdd == true){
            System.out.println("Lista original: " + Arrays.toString(this.list));
            System.out.println("Lista sin impares: "+ newList);
            return "<html>Lista original:<br> " + Arrays.toString(this.list) + "<br>Lista sin impares:<br> "+ newList+"<html>";
        }else{
            System.out.println("No hay números impares");
            return "No hay números impares";
        }

    }
}
