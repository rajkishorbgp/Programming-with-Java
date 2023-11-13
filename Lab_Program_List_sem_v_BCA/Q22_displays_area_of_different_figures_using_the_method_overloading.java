/*
                            @Program: 22
    Write a java program that displays area of different figures 
    (Square,Rectangle,Circle) using the method overloading.
*/

public class Q22_displays_area_of_different_figures_using_the_method_overloading {
    //area of square (width)^2
    public static Double area(Double width){
        return Math.pow(width, 2);
    }
    //area of rectangle = length * width;
    public static Double area(Double length, Double width){
        return length*width;
    }
    //area of circle = pi*r^2
    public static Double area(Double radius, float pi){
        return pi*Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        final Double pi=3.14159265;
        Double width = 10.5;
        Double length = 5.5;
        System.out.println("Area of square: "+ area(width));
        System.out.println("Area of rectangle: "+ area(length,width));
        System.out.println("Area of circle: "+ area(width,pi));
    }
}

/*

Output:
Area of square: 110.25
Area of rectangle: 57.75
Area of circle: 32.986722825

*/