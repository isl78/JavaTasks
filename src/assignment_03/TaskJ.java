package assignment_03;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        while (cnt!=100){
            int num = input.nextInt();
            sum+=num;
            cnt++;
        }
        System.out.println(sum);
    }
}
