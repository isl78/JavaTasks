package firstAssignment;

import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = (a%b)*(b%a)+1;
        System.out.println(res);
    }
}
