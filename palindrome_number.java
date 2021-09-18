package com.company;
import java.util.Scanner;
class palindrome{
     private int number , i, reverse, number2;
     palindrome(int n){
         number=n;
     }
     public void print(){
         number2=number;
         while (number2!=0){
             i=number2%10;
             reverse=(reverse*10)+i;
             number2=number2/10;
         }
         System.out.println(reverse);
         if(reverse==number){
             System.out.println("Number is palindrome number ");
         }
         else {
             System.out.println("Number is not a palindrome number");
         }
     }
}
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        palindrome pl=new palindrome(n);
        pl.print();
    }
}
