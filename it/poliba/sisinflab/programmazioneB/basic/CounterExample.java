package it.poliba.sisinflab.programmazioneB.basic;


public class CounterExample {
    public static void main(String[] args){
        int contatore;
        Counter c;
        c = new Counter();
        c.increment();
        contatore = c.getCounter();
        System.out.println("Il contatore c vale " + contatore);
        c.reset();
        System.out.println("Il contatore c adesso vale " + c.getCounter());
        Counter d = new Counter(5);
        d.increment();
        System.out.println("Il contatore d vale " + d.getCounter());
        Counter e = d;
        System.out.println("Il contatore e vale " + e.getCounter());
        e.increment(7);
        System.out.println("Il contatore e vale " + e.getCounter());
        System.out.println("Il contatore d adesso vale " + d.getCounter());
    }
}
