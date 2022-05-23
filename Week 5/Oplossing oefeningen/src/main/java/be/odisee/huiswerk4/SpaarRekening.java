package be.odisee.huiswerk4;

/**
 * Een spaarrekening is een account die je interest oplevert
 */
public class SpaarRekening extends Account{

    private final double interestRate;

    /**
     * Maakt een spaarrekening aan welke een bepaalde interestvoet biedt
     * @param interest de interestvoet
     */
    public SpaarRekening(final double interest){
        super();
        interestRate = interest;
    }

    private void addInterest(){
        balance *= (1.0 + interestRate);
    }

    /**
     * jaarlijkse aanpassing van de rekening welke de interest toevoegt
     */
    @Override
    public void update() {
        addInterest();
        super.print();
    }

    @Override
    public String toString() {
        return "Spaarrekening "+super.toString();
    }
}
