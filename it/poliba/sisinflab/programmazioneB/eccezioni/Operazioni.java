package it.poliba.sisinflab.programmazioneB.eccezioni;


public class Operazioni {
    public static double divisione(int x, int y) throws DivisionePerZeroException{
        if(y == 0)
            throw new DivisionePerZeroException();
        else
            return (double)x/y;
    }

    public static double logaritmo(int x) throws LogaritmoNonDefinitoException{
        if(x == 0)
            throw new LogaritmoNonDefinitoException();
        else
            return Math.log((double)x);
    }
}
