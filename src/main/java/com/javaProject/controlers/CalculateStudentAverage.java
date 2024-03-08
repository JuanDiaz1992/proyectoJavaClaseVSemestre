package com.javaProject.controlers;

import java.util.Arrays;
import java.util.Map;

public class CalculateStudentAverage {
    private Map <String, double[]> student;
    public CalculateStudentAverage(Map student){
        this.student = student;
    }
    public double[] calculateAverage(){
        double[] listAverage = new double[this.student.size()];
        double acoumalator = 0;
        int iterador = 0;
        for (Map.Entry<String, double[]> entry: this.student.entrySet()){
            //System.out.println(entry.getKey() + Arrays.toString(entry.getValue()));
            for (int i= 0;i<entry.getValue().length;i++ ){
                acoumalator += entry.getValue()[i];

            }
            double average = acoumalator / entry.getValue().length;
            listAverage[iterador] = average;
            System.out.println("El estudiante "+entry.getKey()+" Obtuvo las notas: "+Arrays.toString(entry.getValue())+" Por lo cual su promedio es "+ String.format("%.2f", average));
            acoumalator = 0;
            average = 0;
            iterador++;


        }
        return listAverage;
    }
}
