package assignment_03;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        while (a!=0){
            int last = a%10;
            sum+=last;
            a/=10;
        }
        System.out.println(sum);
    }
}
