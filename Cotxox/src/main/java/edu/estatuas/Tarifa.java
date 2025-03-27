package edu.estatuas;

public class Tarifa {

    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.0;
    final static byte PORCENTAJE_COMISION = 20;


    Tarifa(){}

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }
    public static double getCosteTiempo(int minutos) {
            return minutos * COSTE_MINUTO;
    }


   // public static getCosteTotalEsperado(){

    //}

}
