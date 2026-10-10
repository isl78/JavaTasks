package firstAssignment;

import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),shortBreak,longBreak,res;
        shortBreak = a/2;
        longBreak = a-shortBreak-1;
        res = a*45+shortBreak*5+longBreak*15;
        System.out.println(9+res/60+" "+res%60);
    }
}
