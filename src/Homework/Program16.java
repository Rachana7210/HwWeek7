package Homework;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number :");
        int a = sc.nextInt();
    }
    static void checkNumber(int num) {
        //check if number is positive,negative or zero
        if (num > 0)
            System.out.println("Number is Positive");
        else if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }

}
