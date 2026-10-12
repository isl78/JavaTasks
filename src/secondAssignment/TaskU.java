package secondAssignment;

import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;
        if( a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if (b>c){
            temp = b;
            b = c;
            c = temp;
        }
        if (a+b>c){
            if (a * a + b * b == c * c) System.out.println("right");
            else if (a * a + b * b > c * c) System.out.println("acute");
            else System.out.println("obtuse");
        }else System.out.println("impossible");
    }
}
