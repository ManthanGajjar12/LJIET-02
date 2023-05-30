/*
@Date   :- 30th May 2023
@author :- Manthan Gajjar 
@batch  :- LJIET-IIPC Batch-2

Assignment 1 

Declare the class Circle with members like radius,area & circumference
Declare PI as constant
Accept the radius from user using a method
Calculate the area and display it.
 */

import java.util.Scanner;

class Circle {
    double radius, area, circumference;
    final double PI = 3.14;

    public void setRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of your circle : ");
        radius = scanner.nextDouble();
    }// end of setRadius()

    public void getArea() {
        System.out.println("Area of circle : " + (PI * radius * radius));
    }// end of getArea()

    public void getCircumference() {
        System.out.println("Circumference of circle : " + (2 * PI * radius));
    }
}// end of Class Circle

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius();
        c1.getArea();
        c1.getCircumference();
    }
}// end of Main class
