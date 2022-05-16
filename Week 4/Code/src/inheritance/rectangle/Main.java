package inheritance.rectangle;

public class Main {

    public static void main(String[] args) {
        SoundProducer[] sources = new SoundProducer[]{
                new Kat("kat"),
                new Hond("hond"),
                new Human("mens"),
                new SoundProducer("generiek")
        };

        // for each
        for(SoundProducer source : sources){
            source.makeSound();
        }
    }
}
