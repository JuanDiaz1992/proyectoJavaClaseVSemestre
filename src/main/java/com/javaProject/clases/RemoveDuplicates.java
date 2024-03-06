package com.javaProject.clases;
import java.util.*;

public class RemoveDuplicates {
    private int[] list;
    public RemoveDuplicates(int[] list){
        this.list = list;
    }
    public void remove(){
        List<Integer> listaSinDuplicados = new ArrayList<>();

        for (Integer elemento : this.list) {
            if (!listaSinDuplicados.contains(elemento)) {
                listaSinDuplicados.add(elemento);
            }
        }

        System.out.println("Lista original: " + Arrays.toString(this.list));
        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }
}



