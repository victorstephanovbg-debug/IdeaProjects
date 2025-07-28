package Lecture1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String FirstName = scanner.nextLine();
        System.out.println("Enter your middle name:");
        String MiddleName = scanner.nextLine();
        System.out.println("Enter your surname:");
        String Surname = scanner.nextLine();
        System.out.println("Your full name is: " + FirstName + " " + MiddleName + " " + Surname);
        System.out.println("-----------");
        System.out.print("\n");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
    }
}