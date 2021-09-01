package com.company;
import java.util.Scanner;
class interest{
    public String str;
    public int age;


    void takeUser(){
        System.out.println("Enter the gender ");
        Scanner sc=new Scanner(System.in);
        str= sc.nextLine();
        System.out.println("Enter age ");
        age=sc.nextInt();
    }
    public void returnInterest(){
        if (str.equals("male") && age>1 && age<58){
            System.out.println("the percentage of interest is 8.4%.");
        }
        else if (str.equals("male") && age>58 && age<101) {
            System.out.println("the percentage of interest is 10.5%.");
        }
        else if (str.equals("female") && age>58 && age<101 )
        {
            System.out.println("the percentage of interest is 9.2%.");
        }
        else if (str.equals("male") && age>1 && age<59) {
            System.out.println("the percentage of interest is 8.2%.");
        }
        else {
            System.out.println("you enter something wrong");
        }

    }
}
public class intrest {
    public static void main(String[] args) {
        interest it=new interest();
        it .takeUser();
        it.returnInterest();
    }
}
