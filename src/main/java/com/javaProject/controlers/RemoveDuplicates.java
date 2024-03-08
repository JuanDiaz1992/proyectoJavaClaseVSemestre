package com.javaProject.controlers;
import java.util.*;

public class RemoveDuplicates {
    private int[] list;
    public RemoveDuplicates(int[] list){
        this.list = list;
    }
    public String remove(){
        List<Integer> listaSinDuplicados = new ArrayList<>();
        boolean isDuplicate = false;
        for (Integer elemento : this.list) {
            if (!listaSinDuplicados.contains(elemento)) {
                listaSinDuplicados.add(elemento);
            }else{
                isDuplicate = true;
            }
        }
        if (isDuplicate == true){
            System.out.println("Lista original: " + Arrays.toString(this.list));
            System.out.println("Lista sin duplicados: " + listaSinDuplicados);
            return "<html>"+ "Lista original:<br> " + Arrays.toString(this.list) +"<br>Lista sin duplicados:<br> " + listaSinDuplicados+"<html>";
        }else{
            System.out.println("No hay números duplicados");
            return "No hay números duplicados";
        }

    }
}



