package it.poliba.sisinflab.programmazioneB.basic;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args){
        int[] numeriPrimi = {1,2,3,5,7,11,13,17,19,23,29};
        double[] misure = new double[3];

        int lunghezza;
        Scanner lettore = new Scanner(System.in);

        System.out.println("Il primo numero primo è: " + numeriPrimi[0]);
        System.out.println("Il secondo numero primo è: " + numeriPrimi[1]);
        System.out.println("Il sesto numero primo è: " + numeriPrimi[5]);
        System.out.println("La lunghezza del vettore numeriPrimi è: " + numeriPrimi.length);
        lunghezza = numeriPrimi.length;
        System.out.println("L'ultimo numero primo è: " + numeriPrimi[lunghezza-1]);
        System.out.println();

        System.out.println("Inserisci la prima misura: ");
        misure[0] = lettore.nextDouble();
        System.out.println("Inserisci la seconda misura: ");
        misure[1] = lettore.nextDouble();
        System.out.println("Inserisci la terza misura: ");
        misure[2] = lettore.nextDouble();
        System.out.println("Quale valore vuoi conoscere? ");

        System.out.println("Il valore selezionato è: " + misure[lettore.nextInt()]);

    }
}
