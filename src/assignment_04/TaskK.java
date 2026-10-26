package assignment_04;

import java.util.Scanner;

public class TaskK {
    public static int lcm(int a,int b){
        int mx = Math.max(a, b);
        while (mx%a!=0 || mx%b!=0){
            mx++;
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num1 = input.nextInt();
        System.out.println("LCM = "+lcm(num,num1));
    }
}
