package secondAssignment;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e;
        if (b>d){
                e=d+100-b;
                c--;
        }else  e =d-b;
        System.out.println((c-a)+" "+e);
    }
}
