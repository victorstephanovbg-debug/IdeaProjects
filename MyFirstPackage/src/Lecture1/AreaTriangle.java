package Lecture1;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a-side of the triangle:");
        float a_side = scanner.nextFloat();
        System.out.println("Enter the b-side of the triangle:");
        float b_side = scanner.nextFloat();
        System.out.println("Enter the c-side of the triangle:");
        float c_side = scanner.nextFloat();
        float perimeter = a_side + b_side + c_side;
        double area = Math.sqrt((perimeter/2)*(perimeter/2 - a_side)*(perimeter/2 - b_side)*(perimeter/2 - c_side));
        System.out.println("The area of the triangle is: " + area);
    }
}
