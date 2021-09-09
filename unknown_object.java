//Write a program to print the names of students by creating a Student class.
// If no name is passed while creating an object of Student class,
// then the name should be "Unknown",
// otherwise the name should be equal to the String value passed while creating object
// of Student class
package com.company;
import java.util.Scanner;
class student{
    private String str="Unknown";

    student(String s){
        str=s;
    }
    public String print(){
        return str;
    }
}
public class unknown_object {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        if (str.equals("")){
            str="Unknown";
        }
        student st=new student(str);
        System.out.print(st.print());
    }
}
