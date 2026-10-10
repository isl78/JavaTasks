package firstAssignment;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int hour = a/3600%24;
        int min = (a / 60) % 60;
        int sec = a%60;
        System.out.println(hour+":"+min/10+min%10+":"+sec/10+sec%10);
    }
}
