package com.javaProject.controlers;

public class CurrencyConverter {
    private double cop;
    private int option;
    private static final double exchangeRateUsd = 3963.0;
    private static final double exchangeRateEur = 4294.0;

    public CurrencyConverter(double cop, int option){
        this.cop = cop;
        this.option = option;
    }
    public String conversor(){
        if (this.option>0 && this.option <3  && this.cop>0 ) {
            double result;
            int valueInt;
            switch (this.option){
                case 1:
                    System.out.println("/////////////////////////////////////////////////////////");
                    System.out.printf("%.2f Dolares\n", this.cop / CurrencyConverter.exchangeRateUsd);
                    System.out.println("/////////////////////////////////////////////////////////");
                    result = this.cop / CurrencyConverter.exchangeRateUsd;
                    valueInt = (int) this.cop;
                    return  "<html>"+valueInt + " Correspone a: "+ String.format("%.2f",result) + " Dolares<html>";
                case 2:
                    System.out.println("/////////////////////////////////////////////////////////");
                    System.out.printf("%.2f Euros\n", this.cop / CurrencyConverter.exchangeRateEur);
                    System.out.println("/////////////////////////////////////////////////////////");
                    result = this.cop / CurrencyConverter.exchangeRateEur;
                    valueInt = (int) this.cop;
                    return  "<html>"+valueInt + " Correspone a: " + String.format("%.2f",result)+" Euros<html>";
                default:
                    System.out.println("Opcion errada, intente de nuevo");
                    return "Opcion errada, intente de nuevo";
            }
        }else {
            System.out.println("Opcion errada, intente de nuevo");
        }
        return null;

    }
}
