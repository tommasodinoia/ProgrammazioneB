package it.poliba.sisinflab.programmazioneB.iteratoriemappe;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Set;
import it.poliba.sisinflab.programmazioneB.util.Rettangolo;

public class MappaMain {
    public static void main(String[] args){
        Rettangolo rettangoloTemporaneo;
        HashMap<Rettangolo,String> rettangoloHashMap = new HashMap<Rettangolo,String>();

        HashMap<String,String> stringHashMap = new HashMap<String,String>();
        String[] vettoreDiStringhe = {"cane", "gatto", "topo", "cavallo", "leone"};
        String[] testi = {"Il cane rincorre il gatto", "il gatto rincorre il topo",  "il leone fa spaventare tutti", "il topo fa spaventare il cavallo",};

        stringHashMap.put(vettoreDiStringhe[0],testi[0]);
        stringHashMap.put(vettoreDiStringhe[2],testi[3]);
        stringHashMap.put(vettoreDiStringhe[3],testi[1]);
        stringHashMap.put(vettoreDiStringhe[4],testi[3]);

        System.out.println("----------------");

        System.out.println("Il valore associato alla chiave  \"topo\" è " + "\"" + stringHashMap.get("topo") + "\"");

        System.out.println("----------------");


        Random random = new Random();

        for(int i = 0; i < 4; i++){
            Rettangolo r = new Rettangolo(random.nextDouble(),random.nextDouble());
            rettangoloHashMap.put(r,testi[i]);
        }

        Set<Rettangolo> chiavi = rettangoloHashMap.keySet();
        Iterator<Rettangolo> iteratore = chiavi.iterator();

        while (iteratore.hasNext()) {
            rettangoloTemporaneo = iteratore.next();
            System.out.println("La chiave è rappresentata dal Rettangolo: " + rettangoloTemporaneo.toString());
            System.out.println("Il valore è: " + rettangoloHashMap.get(rettangoloTemporaneo));
        }

        System.out.println("----------------");
    }

}
