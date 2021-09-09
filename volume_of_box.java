//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
// The dimensions of the Box are width, height, depth.
// The class should have a method that can return the volume of the box.
// Create an object of the Box class and test the functionalities.
package com.company;
import java.util.Scanner;
class box{
    private double wed, hei, dep;
    box(double width, double height, double depth){
        wed=width;
        hei=height;
        dep=depth;
    }
    public double volume(){
        return wed*hei*dep;
    }
}
public class volume_of_box {
    public static void main(String[] args) {
        double w, h, d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width of box");
        w=sc.nextDouble();
        System.out.println("Enter the height of box");
        h=sc.nextDouble();
        System.out.println("Enter the depth of box");
        d=sc.nextDouble();
        box bx=new box(w, h, d);
        System.out.println("Volume of box is "+bx.volume());
    }
}
