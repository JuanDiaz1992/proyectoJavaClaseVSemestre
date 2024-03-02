package com.javaProject.clases;

public class InteresCompuesto {
    private final double montoInicial;
    private final double tasaInteresAnual;
    private final double numAnios;
    static double tasaInteresDecimal;
    static double montoFinal;

    public InteresCompuesto(double montoInicial, double tasaInteresAnual, double numAnios){
        this.montoInicial = montoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.numAnios = numAnios;
    }


    public void validateInteres() {
        double tasaInteresDecimal = this.tasaInteresAnual / 100; // Convertir la tasa de interés a decimal
        double montoFinal = this.montoInicial * Math.pow(1 + tasaInteresDecimal, this.numAnios);
        String montoFinalFormateado = String.format("%.2f", montoFinal);
        System.out.println("///////////////////////////////////////");
        System.out.println("El monto final de la inversión después de " + this.numAnios + " años es: $" + montoFinalFormateado);
        System.out.println("///////////////////////////////////////");
    }

}


