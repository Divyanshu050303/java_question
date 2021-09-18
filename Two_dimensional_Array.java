package com.company;
import java.util.Scanner;
class two{
    private final int []array=new int[50];
    private int i, number, c=0;
    two(int n){
        number =n;
    }
    public void input(){
        System.out.println("Enter the element in the array");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<number;i++){
            array[i]=sc.nextInt();
        }
    }
    public void logic(){
        if(number%4==0){
            System.out.println("The given array is...");
            for(i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(array[c]+" ");
                    c+=1;
                }
                System.out.println();
            }
            System.out.println("The reverse of array is...");
            c-=1;
            for(i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(array[c]+" ");
                    c-=1;
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Please enter 4 integer numbers");
        }
    }
}
public class Two_dimensional_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        two to=new two(n);
        to.input();
        to.logic();
    }
}
