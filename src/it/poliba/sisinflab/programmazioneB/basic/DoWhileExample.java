package it.poliba.sisinflab.programmazioneB.basic;


import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 0;
        int numTrue = 0;
        int numFalse = 0;
        boolean[] v = new boolean[5];
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Inserisci il valore di posizione " + i + ": ");
            v[i] = input.nextBoolean();
            i++;
        }while(i < v.length);

        i=0;
        do{
            if(v[i] == true)   // Equivalentemente potrei scrivere if(v[i])
                numTrue++;
            else
                numFalse++;
            i++;
        }while(i< v.length);
        System.out.println("Il numero di true è : " + numTrue);
        System.out.println("Il numero di false è : " + numFalse);
    }
}
