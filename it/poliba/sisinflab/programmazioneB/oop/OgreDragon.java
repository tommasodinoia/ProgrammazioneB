package it.poliba.sisinflab.programmazioneB.oop;

/**
 * Created by tommasodinoia on 30/03/17.
 */
public class OgreDragon extends Ogre implements DragonsActions {

    protected enum DragonColor {RED,GREEN,BLUE,BLACK};

    private boolean flyStatus = false;
    private DragonColor color;

    public OgreDragon(){
        super(Breed.HALF_DRAGON);
        color = DragonColor.GREEN;
    }

    public OgreDragon(int weight, int power, DragonColor color){
        super(Breed.HALF_DRAGON,weight,power);
        this.color = color;
    }

    public Flame spit() {
        return new Flame(100);
    }

    public void fly() {
        if(this.flyStatus == false)
            this.flyStatus = true;
    }

}
