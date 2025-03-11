package it.poliba.sisinflab.programmazioneB.basic;


import java.util.Scanner;

public class ForEachExample {
    public static void main(String[] args) {
        int numTrue = 0;
        int numFalse = 0;
        boolean[] v = new boolean[5];
        Scanner input = new Scanner(System.in);

        for (int i=0; i< v.length; i++){
            System.out.println("Inserisci il valore di posizione " + i + ": ");
            v[i] = input.nextBoolean();
        }

        /*
        *
        * ERRORE: la variabile "i" non esiste più!
        *
        * System.out.println("Il valore di i al termine del ciclo è: " + i);
        *
         */

        for (boolean valore : v){
            if(valore == true)   // Equivalentemente potrei scrivere if(valore)
                numTrue++;
            else
                numFalse++;
        }

        /*
        *
        * ERRORE: la variabile "valore" non esiste più!
        *
        * System.out.println("La variabile valore vale: " + valore);
        *
         */

        System.out.println("Il numero di true è : " + numTrue);
        System.out.println("Il numero di false è : " + numFalse);
    }
}
