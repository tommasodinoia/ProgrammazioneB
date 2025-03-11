package it.poliba.sisinflab.programmazioneB.ricorsione;

/**
 * Created by tommasodinoia on 17/05/17.
 */
public class FunzioniRicorsive {

    // FATTORIALE
    public static int fattoriale(int n) throws IllegalArgumentException{
        if(n < 0)
            throw new IllegalArgumentException();
        else if(n == 0)
            return 1;
        else return n * fattoriale(n-1);
    }


    // DISEGNA IL RIGHELLO
    public static void drawRuler(int nInches, int majorLength){
        drawLine(majorLength,0);
        for(int j = 1; j <= nInches; j++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, j);
        }
    }

    private static void drawInterval(int centralLength){
        if(centralLength >= 1){
            drawInterval(centralLength -1);
            drawLine(centralLength);
            drawInterval(centralLength -1);
        }
    }

    private static void drawLine(int tickLength, int tickLabel){

        for (int j = 0; j < tickLength; j++)
            System.out.println("-");
        if(tickLabel >= 0)
            System.out.println(" " + tickLabel);
        System.out.println("\n");
    }

    private static void drawLine(int tickLength){
        drawLine(tickLength, -1);
    }


    // RICERCA BINARIA
    public static boolean binarySearch(int[] data, int target){
        return binarySearch(data, target, 0, data.length -1);
    }

    private static boolean binarySearch(int[] data, int target, int low, int high){
        if(low < high)
            return false;
        else{
            int mid = (low + high)/2 ;
            if (target == data[mid])
                return true;
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1);
            else return binarySearch(data, target, high, mid + 1);
        }
    }


    // SOMMA LINEARE
    public static int linearSum(int[] data){
        return linearSum(data, data.length);
    }


    private static int linearSum(int[] data, int n){
        if (n == 0)
            return 0;
        else
            return linearSum(data, n-1) + data[n-1];
    }

    // INVERSIONE DI UN ARRAY
    public static void reverseArray(int[] data) {
        reverseArray(data, 0, data.length -1);
    }

    private static void reverseArray(int[] data, int low, int high){
        if (low < high){
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high -1);
        }

    }


    // ELEVAMENTO A POTENZA
    public static double powerLinear(double x, int n){
        if (n == 0)
            return 1;
        else
            return x * powerLinear(x, n-1);
    }

    public static double powerLogn(double x, int n){
        if(n == 0)
            return 1;
        else {
            double partial = powerLogn(x, n / 2);
            double result = partial * partial;
            if (n%2 == 1)
                return result *= x;
            return result;
        }
    }

    // FIBONACCI
    public static long fibonacciExp(int n){
        if (n <= 1)
            return n;
        else
            return fibonacciExp(n - 2) + fibonacciExp(n - 1);
    }


    public static long fibonacci(int n){
        return fibonacciLinear(n)[0];
    }

    public static long[] fibonacciLinear(int n){
        if (n <= 1){
            long[] answer = {n, 0};
            return answer;
        }
        else {
            long[] temp = fibonacciLinear(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }

    }


    // Funzione di Utilità

    public static void stampaArrayInt(int[] a){
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


