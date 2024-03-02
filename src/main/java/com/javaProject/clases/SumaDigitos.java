package com.javaProject.clases;

public class SumaDigitos {
    private String strNumber;

    public SumaDigitos(String strNumber){
        this.strNumber = strNumber;
    }

    public void addNumbers() {
        int countNumbers = 0;
        boolean insertLetter = false;
        for (int i = 0; i < this.strNumber.length(); i++) {
            char currentChar = this.strNumber.charAt(i);
            if (Character.isDigit(currentChar)) {
                int temporaryVariable = currentChar - '0';
                countNumbers += temporaryVariable;
            }else{
                insertLetter = true;
            }
        }
        if (!insertLetter){
            System.out.println("La suma de " + this.strNumber + " es: " + countNumbers);
        }else {
            System.out.println("La suma de " + this.strNumber + " es: " + countNumbers+" Pero intenta no usar letras en esta operación");
        }

    }

    public String getNumber() {
        return strNumber;
    }

    public void setNumber(String number) {
        this.strNumber = number;
    }
}
