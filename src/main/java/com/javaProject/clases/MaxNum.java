package com.javaProject.clases;

import com.javaProject.OrdenadorArrays;
import java.util.Arrays;


public class MaxNum {
    private int[] listNumbers;

    public MaxNum(int[] listNumbers) {
        this.listNumbers = listNumbers;
    }

    public void runProgram(){
        int[] lastList = Arrays.copyOf(this.listNumbers, this.listNumbers.length);;
        OrdenadorArrays.orderList(lastList);
        int lastNumber = this.listNumbers.length;
        System.out.println("El número mayor de la lista "+Arrays.toString(this.listNumbers)+" es: "+lastList[lastNumber-1] );
    }
}
