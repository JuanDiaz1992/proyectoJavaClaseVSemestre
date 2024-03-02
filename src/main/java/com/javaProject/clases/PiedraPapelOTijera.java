package com.javaProject.clases;
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelOTijera {

    private int playerOption;
    private static int machineOption;

    public PiedraPapelOTijera(int playerOption){
        this.playerOption = playerOption;
        Random random = new Random();
        PiedraPapelOTijera.machineOption =  random.nextInt(3)+1;

    }
    public void play(){
        if (this.playerOption > 0 && this.playerOption<4) { //Se valida que la opción del jugador ser valida
            if (this.playerOption == 1 && PiedraPapelOTijera.machineOption == 2){
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido piedra y la maquina papel, haz perdido");
                System.out.println("/////////////////////////////////////");
            } else if (this.playerOption == 2 && PiedraPapelOTijera.machineOption == 3) {
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido papel y la maquina tijera, haz perdido");
                System.out.println("/////////////////////////////////////");
            } else if (this.playerOption == 3 && PiedraPapelOTijera.machineOption == 1) {
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido tijera y la maquina piedra, haz perdido");
                System.out.println("/////////////////////////////////////");
            } else if (this.playerOption == 1 && PiedraPapelOTijera.machineOption == 3) {
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido piedra y la maquina tijera, haz ganado");
                System.out.println("/////////////////////////////////////");
            }else if (this.playerOption == 2 && PiedraPapelOTijera.machineOption == 1) {
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido papel y la maquina piedra, haz ganado");
                System.out.println("/////////////////////////////////////");
            }else if (this.playerOption == 3 && PiedraPapelOTijera.machineOption == 2) {
                System.out.println("/////////////////////////////////////");
                System.out.println("Haz escogido tijera y la maquina papel, haz ganado");
                System.out.println("/////////////////////////////////////");
            }else{
                System.out.println("/////////////////////////////////////");
                System.out.println("Ambos escogieron la misma opción");
                System.out.println("Empate");
                System.out.println("/////////////////////////////////////");
            }
        }else {
            System.out.println("Opción invalida intentelo de nuevo.");
        }
    }

}
