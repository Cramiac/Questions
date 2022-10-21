package Assignments;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int num = in.nextInt();
        System.out.println(OddEven(num));
    }

    public static String OddEven (int num) {
        String ans = "";
        if (num % 2 == 0) {
            ans = "The number is Even";
        }
        else {
            ans = "The number is Odd";
        }
        return ans;
    }
}