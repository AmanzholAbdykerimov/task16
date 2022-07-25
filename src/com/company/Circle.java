package com.company;
import java.util.Scanner;
import static java.lang.Math.PI;
public class Circle {
    static double area;
    static double circumference;
    static Scanner scanner=new Scanner(System.in);
    static int radius=scanner.nextInt();
    static void area() {
        area= PI * (radius * radius);
    }
    static void circumference(){
        circumference=PI*2*radius;
    }
    @Override
    public String toString(){
        return "Area= "+area +"       Circumference= "+circumference ;
    }
}
