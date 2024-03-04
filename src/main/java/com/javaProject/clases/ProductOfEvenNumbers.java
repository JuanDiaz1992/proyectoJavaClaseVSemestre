package com.javaProject.clases;


import java.util.Arrays;

public class ProductOfEvenNumbers {
    private int[] numbersList = {1,2,3,4,5};
    private static int productoPares = 1;

    public ProductOfEvenNumbers(){

    }
    public void runProgram(){
        for (int numero : this.numbersList) {
            if (numero % 2 == 0) {
                ProductOfEvenNumbers.productoPares *= numero;
            }
        }
        System.out.println("El producto de los números paresde la linsta "+ Arrays.toString(this.numbersList)+" es: " + productoPares);
    }
}
