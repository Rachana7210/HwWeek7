package Homework;

public class Program19 {
    public static void main(String[] args) {
     int[] numbers = new int []{40,50,60,70,};
     int sum = 0;
     for (int i=0;i<numbers.length;i++)
         sum=sum+numbers[i];

     double average = sum / numbers.length;
        System.out.println("average value of the array elements is: +average");
    }
}
