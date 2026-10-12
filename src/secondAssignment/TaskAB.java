package secondAssignment;

import java.util.Scanner;

public class TaskAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int t = x / 10;
        int u = x % 10;

        String result = "";

        if (t == 1) result += "X";
        else if (t == 2) result += "XX";
        else if (t == 3) result += "XXX";
        else if (t == 4) result += "XL";
        else if (t == 5) result += "L";
        else if (t == 6) result += "LX";
        else if (t == 7) result += "LXX";
        else if (t == 8) result += "LXXX";
        else if (t == 9) result += "XC";
        else if (t == 10) result += "C";

        if (u == 1) result += "I";
        else if (u == 2) result += "II";
        else if (u == 3) result += "III";
        else if (u == 4) result += "IV";
        else if (u == 5) result += "V";
        else if (u == 6) result += "VI";
        else if (u == 7) result += "VII";
        else if (u == 8) result += "VIII";
        else if (u == 9) result += "IX";

        System.out.println(result);
    }
}
