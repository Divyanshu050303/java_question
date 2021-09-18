package com.company;
import java.util.Scanner;
class character{
    private int i, number;
    private final int []array=new int[50];
    character(int n){
        number =n;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for(i=0;i<number;i++){
            array[i]=sc.nextInt();
        }
    }
    public void logic(){
        char ch;
        System.out.println("After the convert asii to character");
        for(i=0;i<number;i++){
            ch=(char)array[i];
            System.out.print(ch+" ");
        }
    }
}
public class print_the_corresponding_character_values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        character cr=new character(n);
        cr.input();
        cr.logic();
    }
}
