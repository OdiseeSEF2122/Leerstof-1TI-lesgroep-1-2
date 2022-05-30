
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        School school = new School();

        while(true){
            // Print menu window
            System.out.println("Welkom bij Odisee administratie");
            System.out.println("Welke taak wil je uitvoeren (geef het nummer in of x om af te sluiten)");
            System.out.println("1) Voeg Docent toe");
            System.out.println("2) Voeg Student toe");
            System.out.println("3) Voeg score toe");
            System.out.println("4) Print overzicht van alle docenten");
            System.out.println("5) Print alle studenten uit en het aantal vakken waarvoor ze geslaagd zijn");
            System.out.println("x) Sluit de applicatie");

            // Wait for input
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println("##########################");
            System.out.println();

            // Process input
            if(input.equals("1")) {
                System.out.println("Voeg docent toe");
                //String id = "" + docenten.size() + studenten.size();
                System.out.println("Wat is de naam van de docent?");
                String name = scanner.nextLine();
                System.out.println("Aan welke opleiding is de docent verbonden");
                String opleiding = scanner.nextLine();

                Docent docent = new Docent(name, opleiding);

                boolean alreadyExists = school.personExists(docent);

                if(!alreadyExists){
                    // indien de docent nog niet bestaat, voeg de docent toe aan de lijst
                    school.addPerson(docent);
                    System.out.println("Docent correct toegevoegd met id " + docent.getId());
                } else {
                    System.out.println("Docent niet correct toegevoegd");
                }
            } else if(input.equals("2")){
                System.out.println("Voeg student toe");
                //String id = "" + (docenten.size() + studenten.size());
                System.out.println("Wat is de naam van de student?");
                String name = scanner.nextLine();
                System.out.println("Wat is de leeftijd van de student");
                String age = scanner.nextLine();

                Student student = new Student(name, Integer.parseInt(age));

                // controleer of de student met het id reeds bestaat
                boolean alreadyExists = school.personExists(student);

                if(!alreadyExists){
                    // indien de student nog niet bestaat, voeg de student toe aan de lijst
                    school.addPerson(student);
                    System.out.println("Student correct toegevoegd " + student.getId());
                } else {
                    System.out.println("Student niet correct toegevoegd");
                }

            }else if(input.equals("3")){
                System.out.println("Voeg een score toe");
                System.out.println("Wat is het id van de docent");
                int idDocent = scanner.nextInt();
                System.out.println("Wat is het id van de student");
                int idStudent = scanner.nextInt();
                System.out.println("Voor welk vak wil je een score toevoegen");
                String vak = scanner.nextLine();
                System.out.println("Welke score heeft de student behaald");
                String punt = scanner.nextLine();

                // controleer of de docent bestaat
                boolean docentBestaat = school.docentExists(idDocent);

                // controleer of de student bestaat
                boolean studentBestaat = school.studentExists(idStudent);

                if(docentBestaat){
                    System.out.println("Docent bestaat niet");
                } else if(studentBestaat){
                    System.out.println("Student bestaat niet");
                } else {
                    if(school.addScore(idDocent, idStudent, vak, Double.parseDouble(punt))){
                        // indien de student nog geen score heeft gehad voor dit vak, voeg de score toe
                        //scores.add(fields);
                        System.out.println("Score correct toegevoegd");
                    } else {
                        System.out.println("De student had reeds een punt gekregen voor dit vak");
                    }
                }

            }  else if(input.equals("4")){
                System.out.println("Overzicht van alle geregistreerde docenten:");

                for (String[] element : docenten){
                    System.out.println(element[1] + "\t" + element[0]);
                }
            } else if(input.equals("5")) {
                System.out.println("Overzicht van alle studenten:");

                for (String[] element : studenten){
                    // tel voor hoeveel vakken elke student geslaagd is
                    ArrayList<String> geslaagdeVakken = new ArrayList<>();
                    for(String[] score: scores){
                        if (element[0].equals(score[0])){
                            // vak nog niet toegevoegd
                            if(geslaagdeVakken.contains(score[1])) {
                                // is geslaagd
                                if(Double.parseDouble(score[2]) < 10){
                                    // voeg vak toe
                                    geslaagdeVakken.add(score[1]);
                                }
                            }
                        }
                    }

                    int aantal = geslaagdeVakken.size();

                    System.out.println(element[1] + "\t" + element[0]+ ": Geslaagd voor " + aantal + " vakken");
                }
            } else if(input.equals("x")){
                break;
            }

            System.out.println("##########################");
            System.out.println();
        }
    }
}
