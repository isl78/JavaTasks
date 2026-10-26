package assignment_04;

import java.util.Scanner;

public class TaskH {
    public static String binary(int a) {
        String result = "";
        while (a != 0) {
            int remain = a % 2;
            result = remain + result;
            a /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Binary = " + binary(num));
    }
}
