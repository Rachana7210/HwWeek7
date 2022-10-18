package Homework;

public class Program20 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int tofind = 5;
        boolean found = false;

        for (int n : num) {
            if (n == tofind) {
                found = true;
            }
        }
        if (found)
            System.out.println(tofind + "is found.");
        else
            System.out.println(tofind + "is not found");

    }
}
