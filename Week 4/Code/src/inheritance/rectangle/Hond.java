package inheritance.rectangle;

public class Hond extends SoundProducer{

    public Hond(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Woof");
    }
}
