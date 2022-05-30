public class Person {

    private static int numPersons = 0;
    private final int id;

    public Person(){
        id = numPersons;
        numPersons++;
    }

    public int getId(){
        return id;
    }

}
