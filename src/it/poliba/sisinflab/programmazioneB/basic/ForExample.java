package it.poliba.sisinflab.programmazioneB.basic;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        int i;
        int numTrue = 0;
        int numFalse = 0;
        boolean[] v = new boolean[5];
        Scanner input = new Scanner(System.in);

        for (i=0; i< v.length; i++){
            System.out.println("Inserisci il valore di posizione " + i + ": ");
            v[i] = input.nextBoolean();
        }

        for (i=0; i< v.length; i++){
            if(v[i] == true)   // Equivalentemente potrei scrivere if(v[i])
                numTrue++;
            else
                numFalse++;
        }
        System.out.println("Il numero di true è : " + numTrue);
        System.out.println("Il numero di false è : " + numFalse);
    }
}
