package com.javaProject;
import java.util.HashMap;

import java.util.Map;
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
            System.out.println("4) Eliminar duplicados de una lista");
            System.out.println("5) Eliminar impares");
            System.out.println("0) Para volver atrás");
            System.out.print("Elija una opción: ");
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
                case 4:
                    int[] list2 = {10,2,4,89,5,3,2,3,5,2};
                    RemoveDuplicates removeDuplicates = new RemoveDuplicates(list2);
                    removeDuplicates.remove();
                    SecondMenu.pressEnter();
                    break;

                case 5:
                    int[] list3 = {3,2,4,5,6,89,9,1};
                    RemoveOdd removeOdd = new RemoveOdd(list3);
                    removeOdd.runProgram();
                    SecondMenu.pressEnter();
                    break;

                case 6:
                    Map<String, Integer> myHashMap = new HashMap<>();
                    myHashMap.put("Dato1", 10);
                    myHashMap.put("Dato2", 5);
                    myHashMap.put("Dato3", 2);
                    myHashMap.put("Dato4", 3);
                    myHashMap.put("Dato5", 6);
                    break;
                default:

            }
        } while (option != 0);
    }
}
