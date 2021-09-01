package com.company;
import java.util.Scanner;
class ten{
     int num , ind;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    public void print() {
        if (num > 0 && num < 1000000) {
               String n=String.valueOf(num);
               ind=n.length();
            System.out.println("If N is " + num + ", the tens digit is " + n.charAt(ind-2));
        }
    }
}
public class tenth_digit {
    public static void main(String[] args) {
        ten t=new ten();
        t.input();
        t.print();
    }

}
