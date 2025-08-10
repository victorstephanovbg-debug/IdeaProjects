package Lecture1;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a-side of the triangle:");
        float aSide = scanner.nextFloat();
        System.out.println("Enter the b-side of the triangle:");
        float bSide = scanner.nextFloat();
        System.out.println("Enter the c-side of the triangle:");
        float cSide = scanner.nextFloat();
        float perimeter = aSide + bSide + cSide;
        double area = Math.sqrt((perimeter/2)*(perimeter/2 - aSide)*(perimeter/2 - bSide)*(perimeter/2 - cSide));
        System.out.println("The area of the triangle is: " + area);
    }
}
