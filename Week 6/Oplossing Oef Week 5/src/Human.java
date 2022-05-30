public class Human extends Person implements SoundProducer{
    @Override
    public void makeSound() {

    }

    public int sumOfFirstNNumbers(int n){
        //n*(n+1)/2;
        if(n==0){
            return 0;
        }
        return n+ sumOfFirstNNumbers(n-1);
    }

    public void dummy() throws InvalidAgeException {
        try{
            Student student = new Student("", -5);
        } catch (InvalidAgeException ex){
            // los een deel van het probleem op
            throw new InvalidAgeException();
        }
    }
}
