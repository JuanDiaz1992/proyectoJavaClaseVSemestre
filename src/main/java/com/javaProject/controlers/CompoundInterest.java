package com.javaProject.controlers;

public class CompoundInterest {
    private final double startingAmount;
    private final double annualInterestRate;
    private final double numberOfYears;
    static double decimalInterestRate;
    static double finalAmount;

    public CompoundInterest(double startingAmount, double annualInterestRate, double numberOfYears){
        this.startingAmount = startingAmount;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
    }


    public String validateInteres() {
        CompoundInterest.decimalInterestRate = this.annualInterestRate / 100; // Convertir la tasa de interés a decimal
        CompoundInterest.finalAmount = this.startingAmount * Math.pow(1 + CompoundInterest.decimalInterestRate, this.numberOfYears);
        String montoFinalFormateado = String.format("%.2f", CompoundInterest.finalAmount);
        System.out.println("///////////////////////////////////////");
        System.out.println("El monto final de la inversión después de " + this.numberOfYears + " años es: $" + montoFinalFormateado);
        System.out.println("///////////////////////////////////////");
        int yearFormat =  (int) this.numberOfYears;
        return "<html>El monto final de la inversión después de " + yearFormat + "años es: $" + montoFinalFormateado;
    }

}


