package assignment_03;

import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        int power = 0;
        while(a!=0){
            int last = a%10;
            if (last==1) sum+=Math.pow(2,power);
            power++;
            a/=10;
        }
        System.out.println(sum);
    }
}
