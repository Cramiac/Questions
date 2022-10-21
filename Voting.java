package Assignments;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.println(Voting(age));
    }

    public static String Voting (int age) {
        String ans = "";
        if (age < 18) {
            ans = "You are not eligible";
        }
        else {
            ans = "You are eligible";
        }
        return ans;
    }
}