package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userName = "alex";
        String userMajor = "economics";

        System.out.println("Welcome to the Hate Machine!!!\n");
        System.out.println("Please enter your name: ");
        userName = scnr.next();
        System.out.println("please enter your major: ");
        userMajor = scnr.next();
        System.out.println("FUCK YOU " + userName + " YOU DUMB MOTHERFUCKER");
        System.out.println("YOUR MAJOR IN " + userMajor + " IS A WASTE OF MONEY FOR SOMEONE WHO ISN'T GOING TO DO ANYTHING USEFULL IN THEIR ENTIRE LIFE");
    }
}
