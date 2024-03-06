package com.javaProject;
import com.javaProject.clases.*;

import java.util.Scanner;

//Ejecute este archivo para ver un menú con todos los ejercicios planteados :)

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu Principal");
            System.out.println("1) Año Bisiesto");
            System.out.println("2) Piedra papel o tijera");
            System.out.println("3) Cambio de moneda");
            System.out.println("4) Validar interes compuesto");
            System.out.println("5) Sumar una cadena de digitos");
            System.out.println("6) Crear figura");
            System.out.println("7) Ordenar 3 números");
            System.out.println("8) Sumar números aleatorios");
            System.out.println("9) Más opciones");
            System.out.println("0) Salir");
            System.out.print("Elija una opción: ");
            option  = scanner.nextInt();
            switch (option){
                case 1:
                    //Año bisiesto
                    System.out.print("Ingrese el año: ");
                    int inputAnho = scanner.nextInt();
                    LeapYear leapYear = new LeapYear(inputAnho);
                    leapYear.validartAnho();
                    Main.pressEnter();
                    break;
                case 2:
                    //Piedra, papel o tijera
                    System.out.println("1) piedra");
                    System.out.println("2) papel");
                    System.out.println("3) tijera");
                    System.out.print("Ingrese el numero correspondiente: ");
                    int playerOption = scanner.nextInt();
                    RockPaperScissors rockPaperScissors = new RockPaperScissors(playerOption);
                    rockPaperScissors.play();
                    Main.pressEnter();
                    break;
                case 3:
                    //Cambio de moneda
                    System.out.println("Este programa conviert COP a USD o EUR");
                    System.out.println("///////////////////////////////////////");
                    System.out.println("1)USD");
                    System.out.println("2)EUR");
                    System.out.print("Ingrese el tipo de cambio: ");
                    int optionConversor = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de COP a cambiar: ");
                    int cop = scanner.nextInt();
                    CurrencyConverter currencyConverter = new CurrencyConverter(cop, optionConversor);
                    currencyConverter.conversor();
                    Main.pressEnter();
                    break;

                case 4:
                    //Validar interes compuesto
                    System.out.print("Ingrese la cantidad inicial invertida: ");
                    double montoInicial = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                    double tasaInteresAnual = scanner.nextDouble();
                    System.out.print("Ingrese el número de años: ");
                    double numAnios = scanner.nextInt();
                    CompoundInterest compoundInterest = new CompoundInterest(montoInicial, tasaInteresAnual, numAnios);
                    compoundInterest.validateInteres();
                    Main.pressEnter();
                    break;

                case 5:
                    //Sumar digitos
                    System.out.print("Ingrese el número que dese asumar, recuerde agregár más de dos digitos: ");
                    scanner.nextLine();
                    String strNumber = scanner.nextLine();
                    AddDigits addNumbers = new AddDigits(strNumber);
                    addNumbers.addNumbers();
                    Main.pressEnter();
                    break;

                case 6:
                    //Crear figura
                    System.out.print("Ingresa un número positivo entre 1 y 10: ");
                    Integer number = scanner.nextInt();
                    AsterisksPattern asterisksPattern = new AsterisksPattern(number);
                    Main.pressEnter();
                    break;

                case 7:
                    //Ordenar 3 números
                    System.out.println("Validar max,min y medio");
                    System.out.print("Ingresa el primer número: ");
                    int numberOne = scanner.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int nuberTwo = scanner.nextInt();
                    System.out.print("Ingresa tercer número: ");
                    int numberTree = scanner.nextInt();
                    OrderNumbers orderNumbers = new OrderNumbers(numberOne,nuberTwo,numberTree);
                    Main.pressEnter();
                    break;

                case 8:
                    AddRandomNumbers addRandomNumbers = new AddRandomNumbers();
                    System.out.print("Ingresa tu respuesta: ");
                    int response = scanner.nextInt();
                    addRandomNumbers.setResponseUser(response);
                    addRandomNumbers.validateAdd();
                    Main.pressEnter();
                    break;

                case 9:
                    SecondMenu.main();
                default:
            }
        }while (option != 0);
        System.out.println("Programa finalizado.");



    }
    public static void pressEnter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona Enter para continúar");
        scanner.nextLine();
    }
}
