package it.poliba.sisinflab.programmazioneB.basic;


import java.util.Scanner;

public class FunctionsExample {
    public static void main(String[] args) {
        int[] vettore = new int[3];
        int x, y;
        double m;
        Scanner valoriDaTastiera = new Scanner(System.in);

        System.out.println("Adesso carichiamo il vettore.");
        for(int i=0; i<vettore.length; i++){
            System.out.println("Inserisci il valore in posizione " + i);
            vettore[i] = valoriDaTastiera.nextInt();
        }

        System.out.println("La media dei valori del vettore è: " + media(vettore));
        do{
           System.out.println("Di quale coppia di valori vuoi conoscere la media? ");
           x = valoriDaTastiera.nextInt();
           y = valoriDaTastiera.nextInt();
        }while(x<0 || x>=vettore.length || y<0 || y>=vettore.length);


        m = media(vettore[x],vettore[y]);
        System.out.print("La media dei valori di posizione " + x + " e di posizione " + y + " è: " + m);

        if(m > media(vettore))
            System.out.println(" ed è superiore alla media del vettore");
        else
            System.out.println(" ed è inferiore alla media del vettore");

        if(multipli(vettore[x],vettore[y]))
            System.out.println("Sai che " + vettore[x] + " è un multiplo di " + vettore[y] + "?");
        else
            System.out.println("Peccato! " + vettore[x] + " non è un multiplo di " + vettore[y]);

        System.out.println("Il fattoriale di " + vettore[x] + " è " + fattoriale(vettore[x]));

        if(vettore[x] >= vettore[y] && vettore[y] > 0)
            System.out.println("Infine il coefficiente binomiale tra " + vettore[x] + " e " + vettore[y] + " è " + binomiale(vettore[x],vettore[y]));

    }

    public static double media(int[] v){
        int somma = 0;
        for(int valore: v)
            somma += valore;  // somma = somma + valore;
        return (double)somma/v.length;
    }

    public static double media(int n, int k){
        return (double)(n+k)/2;
    }

    public static boolean multipli(int primo, int secondo){
        if(primo%secondo !=0 || secondo==0)
            return false;
        else
            return true;
    }

    public static int fattoriale(int m){
        int f;
        f = 1;
        for(int i=1; i<m; i++){
            f = f*i;    // Equivalentemente possiamo scrivere f *= i;
        }
        return f;
    }

    public static int binomiale(int n, int k){
        return fattoriale(n)/(fattoriale(k)*fattoriale(n-k));
    }

}
