package it.poliba.sisinflab.programmazioneB.ereditarieta;


import java.util.Random;
import java.util.Scanner;

public class ProgressionExample {
    public static void main(String[] args){
        int menu;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Progression p;

        do{
            System.out.println();
            System.out.println("Quale serie vuoi visualizzare? ");
            System.out.println("1 -- Serie semplice ");
            System.out.println("2 -- Serie aritmetica con passo ");
            System.out.println("3 -- Serie geometrica ");
            System.out.println("4 -- Serie di Fibonacci ");
            System.out.println("0 -- Termina l'esecuzione ");
            System.out.print(":-? ");

            menu = input.nextInt();

            switch (menu){
                case 1:
                    p = new Progression();
                    p.printProgression(10);
                    break;
                case 2:
                    long inizio = random.nextLong();
                    long passo = random.nextLong();
                    p = new ArithmeticProgression(passo,inizio);
                    p.printProgression(10);
                    System.out.println("inizio\t: " + inizio);
                    System.out.println("passo\t: " + passo);
                    break;
                case 3:
                    long base = random.nextLong();
                    long start = random.nextLong();
                    p = new GeometricProgression(base,start);
                    p.printProgression(10);
                    System.out.println("base\t: " + base);
                    System.out.println("start\t: " + start);
                    break;
                case 4:
                    long first = random.nextLong();
                    long second = random.nextLong();
                    p = new FibonacciProgression(first,second);
                    p.printProgression(10);
                    System.out.println("first\t: " + first);
                    System.out.println("second\t: " + second);
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Il valore inserito non è valido. ");
            }
            System.out.println();
        }while(menu!=0);

    }
}
