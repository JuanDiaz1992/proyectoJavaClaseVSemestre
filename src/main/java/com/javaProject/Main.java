package com.javaProject;
import com.javaProject.clases.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu Principal");
            System.out.println("1) Año Bisiesto");
            System.out.println("2) Piedra papel o tijera");
            System.out.println("3) Cambio de moneda");
            System.out.println("4) Crear contraseña");
            System.out.println("5) Validar interes compuesto");
            System.out.println("0) Salir");
            System.out.print("Elija una opción: ");
            option  = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.print("Ingrese el año: ");
                    int inputAnho = scanner.nextInt();
                    AnhoBisiesto anhoBisiesto = new AnhoBisiesto(inputAnho);
                    anhoBisiesto.validartAnho();
                    break;
                case 2:
                    System.out.println("1) piedra");
                    System.out.println("2) papel");
                    System.out.println("3) tijera");
                    System.out.print("Ingrese el numero correspondiente: ");
                    int playerOption = scanner.nextInt();
                    PiedraPapelOTijera piedraPapelOTijera = new PiedraPapelOTijera(playerOption);
                    piedraPapelOTijera.play();
                    break;
                case 3:
                    System.out.println("Este programa conviert COP a USD o EUR");
                    System.out.println("///////////////////////////////////////");
                    System.out.println("1)USD");
                    System.out.println("2)EUR");
                    System.out.print("Ingrese el tipo de cambio: ");
                    int optionConversor = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de COP a cambiar: ");
                    int cop = scanner.nextInt();
                    ConversorMoneda conversorMoneda = new ConversorMoneda(cop, optionConversor);
                    conversorMoneda.conversor();
                    break;
                case 4:
                    System.out.println("///////////////////////////////////////");
                    System.out.print("Cree una nueva contraseña: ");
                    scanner.nextLine();
                    String outputPassword = scanner.nextLine();
                    ValidarContrasenha validarContrasenha = new ValidarContrasenha(outputPassword);
                    System.out.println("Contraseña creada correctamente.");
                    do {
                        System.out.println("Validemos el acceso con tu nueva contraseña, ingresala de nuevo");
                        String validateNewPassword = scanner.nextLine();
                        if (validarContrasenha.validatePassword(validateNewPassword)) {
                            System.out.println("Contraseña correcta");
                            break;
                        }else{
                            System.out.println("Contraseña incorrecta");
                        }
                    }while (true);

                    break;

                case 5:
                    System.out.print("Ingrese la cantidad inicial invertida: ");
                    double montoInicial = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                    double tasaInteresAnual = scanner.nextDouble();
                    System.out.print("Ingrese el número de años: ");
                    double numAnios = scanner.nextInt();
                    InteresCompuesto interesCompuesto = new InteresCompuesto(montoInicial, tasaInteresAnual, numAnios);
                    interesCompuesto.validateInteres();
                    break;


                default:

            }
        }while (option != 0);
        System.out.println("Programa finalizado.");

    }
}
