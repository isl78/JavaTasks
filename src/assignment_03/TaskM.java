package assignment_03;

import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int cnt = 0;
        for (int i=1;i<=a;i++){
            int num = input.nextInt();
            if (num==0) cnt++;
        }
        System.out.println(cnt);
    }
}
