package com.javaProject.clases;

public class Mcd {
    private int numberOne;
    private int numberTwo;
    public Mcd(int numberOne, int numberTwo ){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.calculateMCD();

    }
    public void calculateMCD(){
        while (this.numberTwo !=0){
            int temp = this.numberTwo;
            this.numberTwo = this.numberOne % this.numberTwo;
            this.numberOne = temp;
        }
        System.out.println("El MCD es: " + this.numberOne);
    }

}
