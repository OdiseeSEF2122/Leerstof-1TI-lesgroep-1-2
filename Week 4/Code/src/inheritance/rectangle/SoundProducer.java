package inheritance.rectangle;

public class SoundProducer {

    private static int numSources = 0;
    protected final int id;
    protected String name;

    public SoundProducer(String name){
        id = numSources;
        this.name = name;
        numSources++;
    }

    public void makeSound(){
        System.out.print(name + "(" + id + "): ");
    }
}
