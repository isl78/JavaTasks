package assignment_04;

import java.util.Scanner;

public class TaskE {
    public static String isPrime(int a){
        int cnt = 0;
        for(int i=1;i<=a;i++){
            if (a%i==0) cnt++;
        }
        if (cnt==2) return "Prime";
        return  "Not prime";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
}
