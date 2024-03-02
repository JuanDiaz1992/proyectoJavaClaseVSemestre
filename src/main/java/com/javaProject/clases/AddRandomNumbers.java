package com.javaProject.clases;

import java.util.Random;

public class AddRandomNumbers {
    private int responseUser;
    private static int numberOne;
    private static int numberTwo;
    private static int responseCpu;

    public AddRandomNumbers(){
        Random numberOne = new Random();
        Random numberTwo = new Random();
        AddRandomNumbers.numberOne = numberOne.nextInt(10);
        AddRandomNumbers.numberTwo = numberTwo.nextInt(10);
        AddRandomNumbers.responseCpu = AddRandomNumbers.numberOne + AddRandomNumbers.numberTwo;
        this.printValues();
    }
    public AddRandomNumbers(int responseUser){
        this.responseUser = responseUser;
    }

    public void printValues(){
        System.out.println("¿Cual es el resultado de sumar "+AddRandomNumbers.numberOne+" + "+AddRandomNumbers.numberTwo+" ?");
    }
    public void validateAdd(){
        if (this.responseUser == AddRandomNumbers.responseCpu){
            System.out.println("Respuesta acertada, el resultado de "+AddRandomNumbers.numberOne+" + "+AddRandomNumbers.numberTwo + " es: "+AddRandomNumbers.responseCpu);
        }else{
            System.out.println("Error, el resultado de "+AddRandomNumbers.numberOne+" + "+AddRandomNumbers.numberTwo + " es: "+AddRandomNumbers.responseCpu);
        }
    }

    public void setResponseUser(int responseUser) {
        this.responseUser = responseUser;
    }
}
