// This program is shows how  the static keyword work
package com.company;
import java.util.Scanner;
class calculator{
   static int num3, num2;
   static double num1;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num3= sc.nextInt();
        System.out.println("Enter the second number ");
        num2= sc.nextInt();
        num1=num3;
    }
   public static void  powerInt(){
        System.out.println(Math.pow(num3, num2));
    }
     public static double powerDouble(){
        return Math.pow(num1, num2);
    }
}
public class power_of_the_number {

    public static void main(String[] args) {

        calculator cl=new calculator();
        cl.input();
        calculator.powerInt();
        System.out.println(calculator.powerDouble());
    }
}
