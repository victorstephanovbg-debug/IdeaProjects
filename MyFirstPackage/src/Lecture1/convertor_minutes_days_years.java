package Lecture1;

import java.util.Scanner;

public class convertor_minutes_days_years {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of minutes:");
        int minutes = scanner.nextInt();
        float days = (float) minutes / (60*24);
        System.out.println(minutes + " minutes = " + days + " days.");
        float years = (float) minutes / (60*24*365);
        System.out.println(minutes + " minutes = " + years + " years.");
    }
}
