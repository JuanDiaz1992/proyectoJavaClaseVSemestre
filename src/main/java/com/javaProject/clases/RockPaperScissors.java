package com.javaProject.clases;
import java.util.Random;

public class RockPaperScissors {

    private int playerOption;
    private static int machineOption;

    public RockPaperScissors(int playerOption){
        this.playerOption = playerOption;
        Random random = new Random();
        RockPaperScissors.machineOption =  random.nextInt(3)+1;

    }

    public String play(){
        int result;
        if (playerOption == machineOption) {
            result = 0; // Empate
        } else if ((playerOption == 1 && machineOption == 3) ||
                (playerOption == 2 && machineOption == 1) ||
                (playerOption == 3 && machineOption == 2)) {
            result = 1; // Jugador gana
        } else {
            result = -1; // Máquina gana
        }

        switch (result) {
            case 0:
                System.out.println("Empate, ambos escogieron la misma opción.");
                return "<html>Empate, ambos escogieron <br> la misma opción.<html>";
            case 1:
                System.out.println("Haz ganado, escogiste "+ getOptionName(this.playerOption)  +" y la máquina escogió " + getOptionName(machineOption));
                return "<html> Haz ganado 😁, escogiste "+ getOptionName(this.playerOption) +"<br> y la máquina escogió " + getOptionName(machineOption)+"<html>";
            case -1:
                System.out.println("Haz perdido, escogiste "+getOptionName(this.playerOption)+System.lineSeparator()+ " y la máquina escogió " + getOptionName(machineOption));
                return "<html> Haz perdido 😢, escogiste "+getOptionName(this.playerOption)+ "<br> y la máquina escogió " + getOptionName(machineOption)+"<html>";
        }
        return null;
    }
    private String getOptionName(int option) {
        switch (option) {
            case 1:
                return "piedra";
            case 2:
                return "papel";
            case 3:
                return "tijera";
            default:
                return "";
        }
    }

}
