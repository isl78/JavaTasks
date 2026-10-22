package assignment_01;

import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int res = a1-(b1%a1);
        System.out.println(res%a1);
    }
}
