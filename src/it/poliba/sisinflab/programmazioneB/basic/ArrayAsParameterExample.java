package it.poliba.sisinflab.programmazioneB.basic;


public class ArrayAsParameterExample {
    public static void main(String[] args){
        int a, b;
        int[] v = new int[2];
        a = 1;
        b = 2;
        System.out.println("Il valore di a e b è rispettivamente " + a + " e " + b);
        v[0] = 3;
        v[1] = 4;
        System.out.println("I valori in v sono rispettivamente " + v[0] + " e " + v[1]);
        swap(a,b);
        System.out.println("Il valore di a e b dopo la chiamata a swap è rispettivamente " + a + " e " + b);
        swap(v);
        System.out.println("I valori in v dopo la chiamata a swap sono rispettivamente " + v[0] + " e " + v[1]);
    }

    public static void swap(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void swap(int[] vettore){
        int temp;
        temp = vettore[0];
        vettore[0] = vettore[1];
        vettore[1] = temp;
    }
}
