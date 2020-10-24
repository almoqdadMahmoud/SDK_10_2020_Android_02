package com.company;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c ;
        System.out.print("Enter Some char : ");
//        c = scan.next().charAt(0);

        while ((c = scan.next().charAt(0)) != '#'){
            int x = c;
            if(x >= 65 && x <=90){
                System.out.println("Capital");
            }else if(x >= 97 && x <=122){
                System.out.println("Small");
            }else if(x >= 48 && x <=57){
                System.out.println("Digit");
            }else {
                System.out.println("Non");
            }

            System.out.print("Enter Some char : ");
        }


    }
}
