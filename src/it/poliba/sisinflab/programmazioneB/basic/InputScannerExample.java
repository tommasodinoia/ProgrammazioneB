package it.poliba.sisinflab.programmazioneB.basic;

import java.util.Scanner;

public class InputScannerExample {
    public static void main(String[] args) {
        int age;
        int rate;
        double fb;

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la tua età in anni: ");
        age = input.nextInt();
        System.out.println("Inserisci il tuo battito cardiaco massimo: " );
        rate = input.nextInt();
        fb = (rate - age)*0.65;
        System.out.println("Il tuo battito cardiaco ideale è " + fb);
    }
}
