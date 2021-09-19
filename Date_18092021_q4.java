package com.company;
import java.util.Scanner;
class succeeding{
    private int []array=new int[50];
    private int number, i , j, k, sum=0;
    succeeding(int n){
        number =n;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for(i=0;i<number;i++){
            array[i]= sc.nextInt();
        }
    }
    public int logic(){
        if(array[0]==7 && array[number-1]==6){
            for(i=0;i<number;i++){
                sum+=array[i];
            }
        }
        else {
            for (i=0;i<number;i++){
                if(array[i]==6){
                    j=i;
                }
                if(array[i]==7){
                    k=i;
                }
                sum+=array[i];
            }
         for (i=j;i<=k;i++){
             sum-=array[i];
         }
        }
        return sum;
    }
}
public class Date_18092021_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        succeeding sd=new succeeding(n);
        sd.input();
        System.out.println("After the applying the given condition the sum of array is "+sd.logic());

    }
}
