package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //The scanner for user input
        Scanner sc = new Scanner(System.in);

        question();

        int customerType = sc.nextInt();

        customerTypeAns(customerType);

    }

    private static void question() {
        System.out.println("Please specify whether the customer falls in the catagory 1.Residential or 2.Business ");
        System.out.println("1.Customer is Residential");
        System.out.println("2.Customer is Business");

    }

    private static void customerTypeAns(int customerType) {//Switch statement with a default added in case error

        switch(customerType){
        case 1://case one for the information on the residential customer
        residentialCustomer();
        break;

        case 2://case 2 for the business customer
        businessCustomer();
        break;

        default://A default case we will display an error message in case an invalid option is chosen
        System.out.println("Sorry, you have entered an invalid number. Please try again.");

    }

}

//residential customer will have user input and allow user to enter first and last time, as well as phone number
private static void residentialCustomer(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your first and Last time");
    String name = sc.nextLine();
    System.out.println("What is your phone number");
    String phoneNum = sc.nextLine();

    System.out.println(name +"----" + phoneNum);//phone number and name will be displayed.



}
//Business customer will as for business name, contact name and the phone number
private static void businessCustomer(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Business Name: ");
    String businessName = sc.nextLine();
    System.out.println("Enter name");
    String contactName = sc.nextLine();
    System.out.println("Enter business Phone Number");
    String businessPhone = sc.nextLine();

    System.out.print(businessName + "---- " +contactName + "----" + businessPhone);
}



}
