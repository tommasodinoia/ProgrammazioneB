package it.poliba.sisinflab.programmazioneB.basic;


public class Counter {
    private int count;

    public Counter(){
        count = 0;
    }
    public Counter(int initial){
        count = initial;
    }

    public int getCounter(){
        return count;
    }
    public void increment(){
        count++;
    }
    public void increment(int delta){
        count += delta;
    }
    public void reset(){
        count = 0;
    }
}
