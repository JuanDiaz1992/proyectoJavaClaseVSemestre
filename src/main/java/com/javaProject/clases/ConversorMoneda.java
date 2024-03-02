package com.javaProject.clases;

import java.util.Scanner;

public class ConversorMoneda {
    private double cop;
    private int option;
    private static final double tasaCambioDolar = 3963.0;
    private static final double tasaCambioEuro = 4294.0;

    public ConversorMoneda(double cop, int option){
        this.cop = cop;
        this.option = option;
    }
    public void conversor(){
        if (this.option>0 && this.option <3  && this.cop>0 ) {
            switch (this.option){
                case 1:
                    System.out.println("/////////////////////////////////////////////////////////");
                    System.out.printf("%.2f Dolares\n", this.cop / ConversorMoneda.tasaCambioDolar);
                    System.out.println("/////////////////////////////////////////////////////////");
                    break;
                case 2:
                    System.out.println("/////////////////////////////////////////////////////////");
                    System.out.printf("%.2f Euros\n", this.cop / ConversorMoneda.tasaCambioEuro);
                    System.out.println("/////////////////////////////////////////////////////////");
                    break;
                default:
                    System.out.println("Opcion errada, intente de nuevo");
            }
        }else {
            System.out.println("Opcion errada, intente de nuevo");
        }

    }
}
