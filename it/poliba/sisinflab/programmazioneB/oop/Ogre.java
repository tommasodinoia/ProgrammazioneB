package it.poliba.sisinflab.programmazioneB.oop;

/**
 * Created by tommasodinoia on 30/03/17.
 */
public class Ogre implements MosterActions{

    protected enum Breed {PURE,REXXAR,MEDAN,HALF_HUMAN,HALF_GIANT,HALF_DRAGON};
    protected Breed b;
    protected int weight;
    protected int power;


    public Ogre(Breed b){
        this(b,10,5);
    }

    public Ogre(Breed b, int weight, int power){
        this.b = b;
        this.weight = weight;
        this.power = power;
    }

    public void menace(){
        /*
        Qui va l'implementazione del metodo menace()
         */
    }

    public void destroy(){
        /*
        Qui va l'implementazione del metodo menace()
         */
    }

    public String chat(String sentence){
        return "AAARRGGH!";
    }
}
