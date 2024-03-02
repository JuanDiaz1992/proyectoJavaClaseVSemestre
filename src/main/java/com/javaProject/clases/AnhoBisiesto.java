package com.javaProject.clases;
import java.util.Scanner;
public class AnhoBisiesto {
    private int anho;

    public AnhoBisiesto(int anho){
        this.anho = anho;
    }

    public void validartAnho(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        if(this.anho%4 != 0){
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.anho + " NO es bisiesto");
            System.out.println("/////////////////////////////////////");
        }else{
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.anho + " es bisiesto");
            System.out.println("/////////////////////////////////////");
        }


    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }
}
