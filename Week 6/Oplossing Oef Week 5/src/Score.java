public class Score {

    private Docent docent;
    private String vak;
    private double punt;

    public Docent getDocent() {
        return docent;
    }

    public String getVak() {
        return vak;
    }

    public double getPunt() {
        return punt;
    }

    public Score(Docent docent, String vak, double punt) {
        this.docent = docent;
        this.vak = vak;
        this.punt = punt;
    }
}
