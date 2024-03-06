package com.javaProject;
import java.util.*;

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
            System.out.println("6) Eliminar valores menores a un hashmap");
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
                    Map<String, Integer> hashMap = new HashMap<>();
                    for (int i = 1; i < 10; i++) {
                        hashMap.put("Valor"+i,i);
                    }
                    TreeMap<String, Integer> orderHahsMap = new TreeMap<>(hashMap); //Añado esto para ordenar el hashmap antes de mostrarlo
                    System.out.println("HashMap actual: "+orderHahsMap);
                    System.out.print("Ingrese un número entre 1 a 9: ");
                    int optionDeleteHasmap = scanner.nextInt();
                    DeleteDataFromHashMap deleteDataFromHashMap = new DeleteDataFromHashMap(hashMap,optionDeleteHasmap);
                    deleteDataFromHashMap.runProgram();
                    SecondMenu.pressEnter();
                    break;

                case 7:
                    Map<String, double[]> studentGrades = new HashMap<>();
                    studentGrades.put("Michael", new double[]{5, 4, 5});
                    studentGrades.put("Maria", new double[]{3, 5, 2});
                    studentGrades.put("Pedro", new double[]{4, 3, 0});
                    CalculateStudentAverage calculateStudentAverage = new CalculateStudentAverage(studentGrades);
                    calculateStudentAverage.calculateAverage();
                    SecondMenu.pressEnter();
                    break;
                default:

            }
        } while (option != 0);
    }
}
