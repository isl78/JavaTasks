package assignment_01;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        double res = Math.sqrt(a*a+b*b);
        System.out.println(res);
    }
}