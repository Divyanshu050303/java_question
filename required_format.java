package com.company;
import java.util.Scanner;
class accept{
    String str1, str2;
 public void input(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first string");
     str1=sc.nextLine();
     System.out.println("Enter second string");
     str2=sc.nextLine();

 }
 public void print(){
     if(str1.equals("GLA") && str2.equals("Mathura")){
         System.out.println(str1+" University "+str2);
     }
     else if(str1.equals("AAA") && str2.equals("Delhi")){
         System.out.println(str1+" technologies "+str2);
     }
     else{
         System.out.println("Sorry you enter something wrong...");
     }
 }

}
public class required_format {
    public static void main(String[] args) {
        accept ac=new accept();
        ac.input();
        ac.print();
    }
}
