public class Main {

    public static void main(String[] args) {
        PetRock rock = new PetRock("Rocky");

        String result = rock.getName();
        System.out.println(result == "Rocky");
    }
}
