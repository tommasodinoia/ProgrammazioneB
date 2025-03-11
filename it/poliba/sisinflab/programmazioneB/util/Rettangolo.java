
package it.poliba.sisinflab.programmazioneB.util;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLatoCorto() {
        if(altezza < base) {
            return altezza;
        } else {
            return base;
        }
    }

    public double calcolaArea() {
        return base*altezza;
    }

    public double calcolaPerimetro() {
        return 2*(base+altezza);
    }

    public String toString(){
        return "Area: " + this.calcolaArea() + "; Perimetro: " + this.calcolaPerimetro();
    }

}
