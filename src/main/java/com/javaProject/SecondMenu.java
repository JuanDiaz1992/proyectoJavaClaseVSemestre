package com.javaProject;

import java.util.Scanner;
import com.javaProject.clases.*;

public class SecondMenu extends Main{


    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu Principal");
            System.out.println("1) MCD");
            System.out.println("2) Producto de una lista) MCD");
            System.out.println("3) Número más grande de una lista");
            System.out.println("0) Para volver atrás");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int selectNumberOne = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int selectNumberTwo = scanner.nextInt();
                    Mcd mcd = new Mcd(selectNumberOne,selectNumberTwo);
                    SecondMenu.pressEnter();
                    break;

                case 2:
                    ProductOfEvenNumbers productOfEvenNumbers = new ProductOfEvenNumbers();
                    productOfEvenNumbers.runProgram();
                    SecondMenu.pressEnter();
                    break;

                case 3:
                    int[] list = {10,2,4,89,5,3,2};
                    MaxNum maxNum = new MaxNum(list);
                    maxNum.runProgram();
                    SecondMenu.pressEnter();
                    break;

                default:

            }
        } while (option != 0);
    }
}
