package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        String id , name ;

        System.out.print("Enter Your Id : ");
        id = scan.nextLine();
        System.out.print("Enter Your Name : ");
        name = scan.nextLine();

        System.out.println("My Id is : " + id);
        System.out.println("My Name is : " + name);

        System.out.println("Hey there");
    }
}
