package com.javaProject.controlers;

import java.util.Map;
import java.util.TreeMap;

public class DeleteDataFromHashMap {
    private Map<String, Integer> myHashMap;
    private int option;
    public DeleteDataFromHashMap(Map myHashMap,int option){

        this.myHashMap = myHashMap;
        this.option = option;

    }
    public Map runProgram(){
        if (this.option>0 && this.option<10){
            String [] elimitate = new String[this.myHashMap.size()];
            int index = 0;
            for (Map.Entry<String, Integer> entry : this.myHashMap.entrySet()){
                if (entry.getValue() < option){
                    elimitate[index] = entry.getKey();
                    index++;
                }
            }
            for (String key: elimitate){
                this.myHashMap.remove(key);
            }
            TreeMap<String, Integer> orderHahsMap = new TreeMap<>(this.myHashMap);
            System.out.println(orderHahsMap);
            return this.myHashMap;
        }else {
            System.out.println("Elije una opción valida");
            return null;
        }

    }

}
