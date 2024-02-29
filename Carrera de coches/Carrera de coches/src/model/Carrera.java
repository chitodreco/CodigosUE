package model;

import java.util.Scanner;

public class Carrera {

    private String ganador;
    private int kmTotales, numeroVueltas;

    public Carrera(){};

    public Carrera(String ganador, int kmTotales, int numeroVueltas) {
        this.ganador = ganador;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
    }

    public void iniciarCarrera (Coche coche1, Coche coche2){

        System.out.println();
        System.out.println("Las características del "+coche2.getModelo()+ " son las siguientes: ");
        coche2.mostrarDatos();
        System.out.println();;
        System.out.println("Las características del "+coche1.getModelo()+ " son las siguientes: ");
        coche1.mostrarDatos();
        int vueltaExtra = 1;


//Dando vueltas en la carrera
        for (int i = 0; i < numeroVueltas; i++) {

            coche2.acelerarCoche();
            System.out.println("Acelerando al "+coche2.getModelo()+". Kilómetros recorridos: "+coche2.getKm());
            coche1.acelerarCoche();
            System.out.println("Acelerando al "+coche1.getModelo()+". Kilómetros reccoridos: "+coche1.getKm());

            if ((coche2.getKm() >= kmTotales) || (coche1.getKm() >= kmTotales)){
                break;
            }
        }
//Vueltas extra

        while ((coche2.getKm() < kmTotales) && (coche1.getKm() < kmTotales)){
            System.out.println();
            System.out.println("Vuelta extra: "+vueltaExtra);
            coche2.acelerarCoche();
            System.out.println("Acelerando al "+coche2.getModelo()+". Kilómetros recorridos: "+coche2.getKm());
            coche1.acelerarCoche();
            System.out.println("Acelerando al "+coche1.getModelo()+". Kilómetros reccoridos: "+coche1.getKm());
            vueltaExtra += 1;
        }

        System.out.println();
        System.out.println("¡LA CARRERA HA FINALIZADO!");


// Asigna el ganador

        if (coche1.getKm() > coche2.getKm()){
            ganador = coche1.getMatricula();
            System.out.println("El ganador es el coche con la matrícula: "+ganador+" ¡"+coche1.getModelo()
                    +" es el nuevo campeón!");
        } else {
            ganador = coche2.getMatricula();
            System.out.println("El ganador es el coche con la matrícula: "+ganador+" ¡"+coche2.getModelo()
                    +" es el nuevo campeón!");

        }

    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
}
