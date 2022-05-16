package inheritance.rectangle;

public class Human extends SoundProducer{
    // extends keyword zegt dat je overerft van die klasse (max 1 klasse in Java)

    public Human(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        // override keyword geeft aan dat je een overgeerfde functie aanpast
        super.makeSound();
        System.out.println("Hallo");
    }

}
