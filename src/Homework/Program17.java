package Homework;

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        int [] m1 ={
                2222,2212,2213,2214,2215};
        String [] m2 = {"Tea", "Sugar", "Salt"};
        System.out.println("numeric array :"+ Arrays.toString(m1));
        Arrays.sort(m1);
        System.out.println("sorted numeric array :" + Arrays.toString(m1));

        System.out.println("string array :" +Arrays.toString(m2));
        Arrays.sort(m2);
        System.out.println("sorted string array :" + Arrays.toString(m2));

    }
}
