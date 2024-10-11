package com.company;
//Print the sum of first n natural numbers.
// suppose n = 4 (input)
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum = sum + i;
            // 0(sum) + 1(i) = 1(sum), 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10.
        }
        System.out.println(sum);
    }
}
