package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
//        if(number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("odd");
//        }
          switch (number){
              case 1 : System.out.println("Hello");
              break;
              case 2 : System.out.println("Namaste");
              break;
              case 3 : System.out.println("Konichiwa");
              break;
              default: System.out.println("Goodbye");
          }

    }
}
