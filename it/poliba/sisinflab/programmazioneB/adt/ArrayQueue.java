package it.poliba.sisinflab.programmazioneB.adt;

import java.util.Objects;


public class ArrayQueue<E> implements Queue<E> {

    private E[] data;
    private int f = 0;
    private int sz = 0;

    public static final int CAPACITY = 1000;

    public ArrayQueue(){
        this(CAPACITY);
    }

    public ArrayQueue(int capacity){
        data = (E[]) new Objects[capacity];
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return (sz == 0);
    }

    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length)
            throw new IllegalStateException("La coda è piena");
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public E first() {
        if (this.isEmpty())
            return null;
        return data[f];
    }

    public E dequeue() {
        if (this.isEmpty())
            return null;
        E answer = data[f];
        data[f] = null;
        f = (f+1)%data.length;
        sz--;
        return answer;
    }
}
