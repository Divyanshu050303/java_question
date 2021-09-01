package com.company;
import java.util.Scanner;
class welcome{
    String str;
    public void input(){
        System.out.println("Enter the name ");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
    }
    public void print(){
        System.out.println("Welcome "+str);
    }

}

public class sample {
    public static void main(String[] args) {
        welcome we=new welcome();
        we.input();
        we.print();
    }
}
