// Design an application in java that contains a class Student having properties
// name and percentage. Create a class Test that declares three instances of Student class.
// The values are passed through constructor at the time of its object creation.
// The output should be the name and percentage of the topper.
package com.company;
import java.util.Scanner;
class test{
    private String Name;
    private double percentage;
    test(String name, double Percentage){
        Name=name;
        percentage=Percentage;
    }
    public void print(){
        System.out.println("Name of student is "+Name+" and the percentage is "+percentage);
    }
}
public class application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String nam=sc.nextLine();
        System.out.println("Enter the percentage of student ");
        double per=sc.nextDouble();
        test ts=new test(nam, per);
        ts.print();

    }
}
