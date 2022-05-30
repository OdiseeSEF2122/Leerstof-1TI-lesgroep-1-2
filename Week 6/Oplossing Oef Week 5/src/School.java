import java.util.ArrayList;

public class School {

    private ArrayList<Person> personen = new ArrayList<>();

    /**
     * Aggregatie
     * @param person
     */
    public void addPerson(Person person){
        // doe de controle op exists in de school klasse, anders leg je de verantwoordelijkheid
        // voor deze controle bij de gebruikers van deze klasse in de hele applicatie
        if(!personExists(person)) {
            personen.add(person);
        }
    }

    /**
     * Compositie
     * @param person
     */
    public void addDocent(String naam, String opleiding){
        personen.add(new Docent(naam, opleiding));
    }

    private Person findPerson(int id){
        for (Person p : personen){
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public boolean personExists(Person person){
        /*for (Person p : personen){
            if (person.getId() == p.getId()) {
                return true;
            }
        }

        return false;*/

        return findPerson(person.getId()) != null;

    }

    public boolean docentExists(int id){
        return findPerson(id) instanceof Docent;
    }

    public boolean studentExists(int id){
        return findPerson(id) instanceof Student;

    }

    public boolean addScore(int docentId, int studentId, String vak, double punt){
        Person docent = findPerson(docentId);
        Person student = findPerson(studentId);
        if(student instanceof Student && docent instanceof Docent) {
            return ((Student) student).addScore(vak, (Docent) docent, punt);
        }

        return false;
    }
}
