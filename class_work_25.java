package com.company;
class AddAmount{
    int amount=50;
    AddAmount(){
        System.out.println("This constructor has no parameter ");
        System.out.println("The amount is "+amount);
    }
    AddAmount(int a){
        System.out.println("This constructor has one parameter ");
        System.out.println("After the add the amount in the piggie bank the total amount is "+(amount+a));
    }

}
public class class_work_25 {
    public static void main(String[] args) {
        AddAmount a=new AddAmount();
        AddAmount b=new AddAmount(7);
    }
}
