package it.poliba.sisinflab.programmazioneB.basic;



import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args){
        double a;
        int b;
        int resto;

        Scanner input = new Scanner(System.in);
        //Scanner input = new Scanner(System.in).useLocale(Locale.US);
        a = Math.random()*100;
        b = (int)(Math.random()*100);
        System.out.println("Il valore generato per a è: " + a);
        System.out.println("Il valore generato per b è: " + b);

        resto = b%2;

        if(a >= 50 && resto==1){
            System.out.println("Non gradisco i numeri maggiori o uguali a 50 se associati a quelli dispari");
            System.out.println("Inserici un nuovo numero decimale ");
            a = input.nextDouble();
        } else if(a < 50)
            System.out.println("Il numero " + a + " mi piace. Bene! ");
        else{
            System.out.println("I numeri pari come il " + b + " oggi non va bene. Inserisci un nuovo intero. ");
            b = input.nextInt();
        }

        System.out.println("Alla fine i valori di a e di b sono rispettivamente ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
