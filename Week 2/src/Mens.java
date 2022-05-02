public class Mens {
    private String voornaam;
    private String achternaam;
    private int leeftijd;
    public boolean magStemmen;

    public Mens(String voornaam, String achternaam, int leeftijd, boolean magStemmen) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.leeftijd = leeftijd;
        this.magStemmen = magStemmen;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void lach() {
        System.out.println(voornaam + " Hahahahahahaha");
    }
}
