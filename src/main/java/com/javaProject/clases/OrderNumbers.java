package com.javaProject.clases;

public class OrderNumbers {
    private int numberOne;
    private int numberTwo;
    private int numberTree;
    static int max;
    static int min;
    static int medium;

    public OrderNumbers(int numberOne, int numberTwo, int numberTree){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberTree = numberTree;
    }


    public String organizer(){

        if (
                this.numberOne != this.numberTwo
                && this.numberOne != this.numberTree
                && this.numberTwo != this.numberTree
        ){
            OrderNumbers.min = this.numberOne;
            if(this.numberTwo < OrderNumbers.min){
                OrderNumbers.min = this.numberTwo;
            }
            if (this.numberTree < OrderNumbers.min) {
                OrderNumbers.min = this.numberTree;
            }

            OrderNumbers.max = this.numberOne;
            if (this.numberTwo > OrderNumbers.max) {
                OrderNumbers.max = this.numberTwo;
            }
            if (this.numberTree > OrderNumbers.max) {
                OrderNumbers.max = this.numberTree;
            }

            OrderNumbers.medium = (this.numberOne + this.numberTwo + this.numberTree) - OrderNumbers.max - OrderNumbers.min;

            System.out.println("Mayor: "+OrderNumbers.max +", Medio: "+OrderNumbers.medium+", Menor: "+OrderNumbers.min);
            return "Mayor: "+OrderNumbers.max +", Medio: "+OrderNumbers.medium+", Menor: "+OrderNumbers.min;
        }else {
            System.out.println("Debes ingresar números diferentes entre sí");
            return  "Ingresa números diferentes entre sí";
        }


    }
}
