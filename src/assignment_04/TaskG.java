package assignment_04;

import java.util.Scanner;

public class TaskG {
    public static int factorial(int a){
        int sum=1;
        for (int i=1;i<=a;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Factorial "+factorial(num));
    }
}
