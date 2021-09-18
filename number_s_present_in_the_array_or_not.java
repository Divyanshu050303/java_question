package com.company;
import java.util.Scanner;
class present{
    private final int []array=new int[50];
    private int number, i, search, ret;
    present(int n){
        number =n;

    }
    public void input(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter element in the array");
        for(i=0;i<number;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the number which do you want to search in the array");
        search=sc.nextInt();
    }
    public int  print(){
        for(i=0;i<number;i++){
            if (search==array[i]){
                ret=i;
            }
            else{
                ret=-1;
            }
        }
        return ret;
    }
}
public class number_s_present_in_the_array_or_not {
    public static void main(String[] args) {
        int n, s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        present pr=new present(n);
        pr.input();
        if(pr.print()==-1){
            System.out.println(-1+" Sorry number is not present in the array");
        }
        else {
            System.out.println("The number is present at "+pr.print());
        }

    }
}
