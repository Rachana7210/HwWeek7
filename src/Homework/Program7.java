package Homework;

import java.util.Scanner;

public class Program7 {
    static int salesID, salesAmount, basicSalary;
    static double commision;
    static String sellersname;

    public static void main(String[] args) {
        info();
    }

    public static void info() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales ID:");
        salesID = sc.nextInt();
        System.out.println("Enter saler's Name:");
        sellersname = sc.next();
        System.out.println("Enter sales amount:");
        salesAmount = sc.nextInt();
        System.out.println("Enter Basic salary:");
        basicSalary = sc.nextInt();

        if (salesAmount >= 50000) {
            commision = (salesAmount * 35) / 100;
            System.out.println("saler's commission is : +commission");
        } else if (salesAmount >= 30000) {
            commision = (salesAmount * 20) / 100;
            System.out.println("saler's commision is : +commission");
        } else if (salesAmount >= 20000) {
            commision = (salesAmount * 10) / 100;
            System.out.println("saler's commision is : +commission");
        } else if (salesAmount >= 10000) {
            commision = (salesAmount * 5) / 100;
            System.out.println("saler's commision is : +commission");
        } else if (salesAmount >= 5000) {
            commision = (salesAmount * 2) / 100;
            System.out.println("saler's commision is : +commission");
        }


    }


}






