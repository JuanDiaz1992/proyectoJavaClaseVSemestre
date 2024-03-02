package com.javaProject.clases;

public class AsterisksPattern {
    private Integer amount;
    public AsterisksPattern(Integer amount){
        this.amount = amount;
        this.generateTriangle();
    }
    public void generateTriangle(){
        if (this.amount > 0 && this.amount <10){
            for (int i = 1; i <= this.amount; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("Ingresa un número válido");
        }

    }
}
