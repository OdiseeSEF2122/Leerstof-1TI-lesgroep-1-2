package oefTijdspanne;

/** onthoudt een tijdspanne als een aantal minuten */
public class Tijdspanne {
    protected int minuten;
    public Tijdspanne(int minuten) {
        this.minuten = minuten;
    }
    public int getMinuten() {
        return minuten;
    }

    /**
     * Tel 2 tijdspannes bij elkaar op: de eigen tijd plus de tijd van de andere
     * @param andere andere tijdspanne
     */
    public void bijTellen(Tijdspanne andere) {
        minuten += andere.getMinuten();
    }
}
/** onthoudt een tijdspanne als een aantal minuten en seconden */
class PreciezeTijdspanne extends Tijdspanne {
    protected int seconden;
    public int getSeconden() {
        return seconden;
    }
    public PreciezeTijdspanne(int minuten, int seconden) {
        super(minuten);
        this.seconden = seconden;
    }

    /**
     * Tel 2 tijdspannes bij elkaar op: de eigen tijd plus de tijd van de andere
     * @param andere andere tijdspanne
     */
    public void bijTellen(PreciezeTijdspanne andere) {
        super.bijTellen(andere);
        seconden += andere.getSeconden();
    }
}
