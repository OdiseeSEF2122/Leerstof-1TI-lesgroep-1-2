package be.odisee;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");
        double input =  sc.nextDouble();

        Square square = new Square();
        double squareOfInput = square.square(input);
        double sqrtOfInput = square.squareRoot(input);

        System.out.println("Origineel " + input);
        System.out.println("Square " + squareOfInput);
        System.out.println("Square root " + sqrtOfInput);
    }
}
