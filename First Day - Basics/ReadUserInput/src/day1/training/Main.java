package day1.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        System.out.println(hasNextInt);
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            System.out.println("Your name  is " + name + " and your age is " + age);
        }else{
            System.out.println("Unable to parse year! Exiting...");
        }
        scanner.close();
    }
}
