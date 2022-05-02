/**
 * Dit is een klasse voor huisdier stenen.
 * Er moet mee gespeeld worden om ze gelukkig te maken
 */
public class PetRock {

    /**
     * Naam van de steen
     */
    private String name;
    private boolean happy;

    public PetRock(String name){
        this.name = name;
        happy = false;
    }

    public String getName(){
        return name;
    }

    /**
     * Check if de steen is happy
     * @return true if de steen is happy
     */
    public boolean isHappy(){
        return happy;
    }

    public void play(){
        happy=true;
    }
}
