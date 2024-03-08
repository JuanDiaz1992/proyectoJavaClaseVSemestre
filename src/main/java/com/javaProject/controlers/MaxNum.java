package com.javaProject.controlers;

import java.util.Arrays;


public class MaxNum {
    private int[] listNumbers;

    public MaxNum(int[] listNumbers) {
        this.listNumbers = listNumbers;
    }

    public String runProgram(){
        int[] lastList = Arrays.copyOf(this.listNumbers, this.listNumbers.length);;
        Arrays.sort(lastList);
        int lastNumber = this.listNumbers.length;
        System.out.println("El número mayor de la lista "+Arrays.toString(this.listNumbers)+" es: "+lastList[lastNumber-1] );
        return "<html>El número mayor de la lista<br> "+Arrays.toString(this.listNumbers)+" <br>Es el: "+lastList[lastNumber-1]+"<html>";
    }
}
