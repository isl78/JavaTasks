package assignment_01;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), a1,a2,a3;
        a1 = a/100;
        a2 = a/10%10;
        a3 = a%10;

        System.out.println(a1+a2+a3);
    }
}
