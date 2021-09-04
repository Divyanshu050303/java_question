package com.company;
import java.util.Scanner;
class rectangle{
    static double len, bre;
    public static void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        len= sc.nextDouble();
        System.out.println("Enter the breath of rectangle");
        bre=sc.nextDouble();
    }
    public static double  area(){
        return len*bre;
    }
}
public class area_rectangle {
    public static void main(String[] args) {
        rectangle.input();
        System.out.println(rectangle.area());
    }
}
