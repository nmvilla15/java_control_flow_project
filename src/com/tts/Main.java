package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");     // type a word and hit enter
        String someName = scanner.next();
        System.out.println("Hello " + someName);

        System.out.print("Would you like to continue to the interactive portion? (yes, no): ");
        String someActivity = scanner.next();
            if (someActivity.equalsIgnoreCase("yes") || someActivity.equalsIgnoreCase("y")){
            System.out.println("Great! Let's continue.");
        }
        else {
            System.out.println("Goodbye! Please come back later and complete our survey.");
            System.exit(0);
        }

        System.out.print("Do you have a red car? (yes, no): ");
        String someCar = scanner.next();

        System.out.print("What is the name of your favorite pet?: ");
        String somePet = scanner.next();

        System.out.print("What is your favorite pet's age?: ");
        int somePetAge = scanner.nextInt();

        System.out.print("What is your lucky number?: ");
        int someLucky = scanner.nextInt();

        System.out.print("Do you have a favorite quarterback?(yes, no): ");
        String someFootball = scanner.next();

        System.out.print("If so what is their jersey number? If you don't have one enter any two-digit number: ");
        int someJersey = scanner.nextInt();

        System.out.print("What is the two-digit model year of your car?: ");
        int someModel = scanner.nextInt();

        System.out.print("What is the first name of your favorite actor or actress?: ");
        String someActor = scanner.next();

        System.out.print("Enter a random number between 1 and 50: ");
        int someRandom = scanner.nextInt();

        System.out.println("Thank you! Here are your lottery numbers: " + someModel + ", " + (someRandom - 1) + ", 42" + ", " + (somePetAge + someModel) + ", " + (someJersey + somePetAge) + "  Magic Ball: " + (someLucky * 2));

    }
}

