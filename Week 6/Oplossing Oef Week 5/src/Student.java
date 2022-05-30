import java.util.ArrayList;

public class Student extends Person{

    // name moet eerder ook in de Person parent class omdat het gedeeld wordt met de docent klasse
    private String name;
    private int age;
    private ArrayList<Score> scores = new ArrayList<>();

    public Student(String name, int age) throws InvalidAgeException {
        if(age<5){
            throw new InvalidAgeException();
        }
        this.name = name;
        this.age = age;
    }

    public boolean addScore(String vak, Docent docent, double punt){
        for (Score score : scores){
            if (vak.equals(score.getVak())) {
                return false;
            }
        }

        scores.add(new Score(docent, vak, punt));
    }

}
