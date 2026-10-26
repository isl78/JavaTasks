package assignment_04;

import java.util.Scanner;

public class TaskJ {
    public static int gcd(int x,int y){
        int mn = Math.min(x,y);
        int result = 1;
        for (int i=1;i<=mn;i++){
            if (x%i==0 && y%i==0) result = i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));
    }
}

