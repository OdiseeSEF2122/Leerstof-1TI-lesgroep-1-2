package inheritance.rectangle;

public class Kat extends SoundProducer{

    public Kat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Miauw");
    }
}
