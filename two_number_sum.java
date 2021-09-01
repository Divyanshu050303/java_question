package com.company;
import java.util.Scanner;
class sum{
    int s1, s2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        s1=sc.nextInt();
        System.out.println("Enter second number");
        s2=sc.nextInt();
    }
    public void print(){
        System.out.println("The sum of "+s1+" and "+s2+" is "+(s1+s2));
    }
}
public class two_number_sum {
    public static void main(String[] args) {
        sum s=new sum();
        s.input();
        s.print();
    }
}
