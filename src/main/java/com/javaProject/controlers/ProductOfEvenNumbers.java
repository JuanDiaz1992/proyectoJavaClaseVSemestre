package com.javaProject.controlers;


import java.util.Arrays;

public class ProductOfEvenNumbers {
    private int[] numbersList;


    public ProductOfEvenNumbers(int[] numbersList){
        this.numbersList = numbersList;
    }
    public String runProgram(){
        int productoPares = 1;
        for (int numero : this.numbersList) {
            if (numero % 2 == 0 && numero != 0) {
                productoPares *= numero;
            }
        }
        System.out.println("El producto de los números paresde la linsta "+ Arrays.toString(this.numbersList)+" es: " + productoPares);
        return "<html>El producto de los números pares de la lista <br> "+ Arrays.toString(this.numbersList)+" es: " + productoPares+"<html>";

    }


    public int[] getNumbersList() {
        return numbersList;
    }
}
