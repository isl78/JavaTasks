package thirdAssignment;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        for (int i=1;i<=a;i++){
            int num = input.nextInt();
            sum+=num;
        }
        System.out.println(sum);
    }
}
