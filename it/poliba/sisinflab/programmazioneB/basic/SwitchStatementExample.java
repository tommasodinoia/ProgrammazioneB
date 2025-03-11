package it.poliba.sisinflab.programmazioneB.basic;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class SwitchStatementExample {

    public enum Giorno {LUN,MAR,MER,GIO,VEN,SAB,DOM};

    public static void main(String[] args){
        GregorianCalendar calendario = new GregorianCalendar();
        int giornoSett = calendario.get(Calendar.DAY_OF_WEEK);

        System.out.println("Il giorno della settimana restituito è " + giornoSett);

        switch (Giorno.values()[giornoSett-1]){
            case LUN:
                System.out.println("Oggi è Lunedì");
                break;
            case MAR:
                System.out.println("Oggi è Martedì");
                break;
            case MER:
                System.out.println("Oggi è Mercoledì");
                break;
            case GIO:
                System.out.println("Oggi è Giovedì");
                break;
            case VEN:
                System.out.println("Oggi è Venerdì");
                break;
            default:
                System.out.println("Evviva il weekend!");
        }

    }
}
