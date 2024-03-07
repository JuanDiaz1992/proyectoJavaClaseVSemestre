package com.javaProject.clases;

public class AsterisksPattern {
    private Integer amount;
    public AsterisksPattern(Integer amount){
        this.amount = amount;

    }
    public String generateTriangle(){
        StringBuilder triangle = new StringBuilder();
        if (this.amount > 0 && this.amount <=8){
            for (int i = 1; i <= this.amount; i++) {
                for (int j = 1; j <= i; j++) {
                    triangle.append("*");
                }
                triangle.append("<br>");
            }
        }else {
            triangle.append("Ingresa un número válido");
        }
        return "<html>" + triangle.toString() + "</html>";
    }
}
