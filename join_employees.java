package com.company;
import java.util.Scanner;
class Employees{
    static String [] address=new String[4];
    static  String [] name=new String[4];
     static int [] yearJoining=new int[4];
    public static  void input(){
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<4;i++) {
            System.out.println("Enter the name of " + i + " Employee");
            name[i] = sc.nextLine();
        }
        for (int i=1;i<4;i++) {
            System.out.println("Enter the year of joining of " + i + " Employees ");
            yearJoining[i] = sc.nextInt();
        } for (int i=1;i<4;i++) {
            System.out.println("Enter the address of  " + i + " Employees ");
            address[i] = sc.next();
        }
    }
    public static void print(){
        System.out.println("Name       year of joining      address");
        for (int j=1; j<4;j++){
            System.out.println(name[j]+"      "+yearJoining[j]+"      "+address[j]);
        }
    }
}
public class join_employees {
    public static void main(String[] args) {
        Employees.input();
        Employees.print();
    }
}
