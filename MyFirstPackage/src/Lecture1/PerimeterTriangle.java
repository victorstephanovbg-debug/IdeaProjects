package Lecture1;

import java.util.Scanner;

public class PerimeterTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a-side of the triangle:");
        float aSide = scanner.nextFloat();
        System.out.println("Enter the b-side of the triangle:");
        float bSide = scanner.nextFloat();
        System.out.println("Enter the c-side of the triangle:");
        float cSide = scanner.nextFloat();
        float perimeter = aSide + bSide + cSide;
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}
