package com.company;
import java.util.Scanner;
class employeeSalary{
    static int salary, hours;
    public void getinfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary in $");
        salary=sc.nextInt();
        System.out.println("Enter the number of hours");
        hours= sc.nextInt();
    }
    public void addsl(){
        if (salary<500){
            salary+=10;
        }
    }
    public void addWork(){
        if (hours>6){
        salary+=5;
        }
    }
public int print(){
        return salary;
}
}
public class employee_salary {
    public static void main(String[] args) {
        employeeSalary es=new employeeSalary();
        es.getinfo();
        es.addsl();
        es.addWork();
        System.out.println("Now the final salary is "+es.print());
    }
}
