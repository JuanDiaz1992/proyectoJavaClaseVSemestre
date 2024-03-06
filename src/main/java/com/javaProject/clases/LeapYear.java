package com.javaProject.clases;

public class LeapYear {
    private int year;

    public LeapYear(int year){
        this.year = year;
    }

    public void validartAnho(){
        if(this.year%4 != 0){
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.year + " NO es bisiesto");
            System.out.println("/////////////////////////////////////");
        }else{
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.year + " es bisiesto");
            System.out.println("/////////////////////////////////////");
        }


    }

    public int getAnho() {
        return year;
    }

    public void setAnho(int anho) {
        this.year = anho;
    }
}
