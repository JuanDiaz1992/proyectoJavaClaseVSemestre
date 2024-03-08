package com.javaProject.controlers;

public class LeapYear {
    private int year;

    public LeapYear(int year){
        this.year = year;
    }

    public String validartAnho(){
        if(this.year%4 != 0){
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.year + " NO es bisiesto");
            System.out.println("/////////////////////////////////////");
            return "El año "+this.year + " NO es bisiesto";
        }else{
            System.out.println("/////////////////////////////////////");
            System.out.println("El año "+this.year + " es bisiesto");
            System.out.println("/////////////////////////////////////");
            return "El año "+this.year + " es bisiesto";
        }


    }

    public int getAnho() {
        return year;
    }

    public void setAnho(int anho) {
        this.year = anho;
    }
}
