package Homework;

import java.util.Objects;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Enter first letter of city from (A to F only)");
        String a = city.nextLine();
        if (Objects.equals(a.toUpperCase(), "A")){
            System.out.println("City is Agra");
        }else if (Objects.equals(a.toUpperCase(),"B")){
            System.out.println("City is Baroda");
        }else if (Objects.equals(a.toUpperCase(), "C")){
            System.out.println("City is Calcutta");
        }else if (Objects.equals(a.toUpperCase(), "D")){
            System.out.println("City is Delhi");
        }else if (Objects.equals(a.toUpperCase(), "E")){
            System.out.println("City is Edinburgh");
        }else if (Objects.equals(a.toUpperCase(), "F")){
            System.out.println("City is Farnborough");
        }else{
            System.out.println("Error: Invalid Entry");
        }
    }
}



