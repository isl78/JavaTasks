package assignment_06;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String[] arr = word.trim().split("\\s+");
        int mx = arr[0].length();
        String res = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i].length()>mx){
                mx=arr[i].length();
                res=arr[i];
            }
        }
        System.out.println(res);
    }
}
