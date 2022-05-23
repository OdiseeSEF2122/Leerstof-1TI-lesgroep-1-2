package be.odisee.huiswerk4;
/**
 * Een zichtrekening is een account die toelaat om onder 0 te gaan
 * Een gewenste negatieve limiet wordt per rekening gehanteerd en het overschreiden ervan geeft aanleiding tot een waarschuwingsbrief
 */
public class ZichtRekening extends Account {

    private final double overdraftLimit;

    /**
     * Maakt een zichtrekening met een minimum limiet
     * @param overdraftLimit gewenste negatief minimum van de balans
     */
    public ZichtRekening(final double overdraftLimit){
        super();
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Haalt een bepaalde som uit de rekening
     * @param amount positieve af te halen som
     */
    @Override
    public void withdraw(double amount){
        if (amount>0) {
            balance -= amount;
        } else {
            System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
            //or throw an exception
        }
    }
    /**
     * jaarlijkse controle van de rekening welke waarschuwingen aanmaakt indien de limiet overschreden is
     */
    @Override
    public void update() {
        super.print();
        if(balance < -overdraftLimit){
            System.out.println("OVERDRAFT -> send letter");
        }
    }
    @Override
    public String toString() {
        return "Zichtrekening "+super.toString();
    }
}
