package it.poliba.sisinflab.programmazioneB.oop;

/**
 * Created by tommasodinoia on 30/03/17.
 */
public class Flame {
    private boolean active;
    private int intensity;

    public Flame(int intensity){
        active = true;
        this.intensity = intensity;
    }

    public Flame(){
        active = false;
        this.intensity = 0;
    }

    public void setIntensity(int intensity){
        if(this.active == true)
            this.intensity = intensity;
        else
            this.intensity = 0;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void swapActive(){
        this.active = !this.active;
    }
}
