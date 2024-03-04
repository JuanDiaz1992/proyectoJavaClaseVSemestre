package com.javaProject;

public class OrdenadorArrays {
    public static void orderList(int [] list){
        for (int i = 0; i < list.length; i++) {
            boolean sorted = true; // asumo que para la iteración i el listado es ordenado,
            for (int j = 0; j < list.length - i - 1; j++) { // en cada iteración los elementos desde la posición (length-i) estan ordenados, por lo tanto solo recorro hasta esa posición
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                return;
            }
        }

    }
}
