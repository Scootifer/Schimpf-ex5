/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n1 = scan.nextInt();

        System.out.print("\nPlease enter another number: ");
        int n2 = scan.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + "\n" + n1 + " - " + n2 + " = " + (n1 - n2) + "\n" + n1 + " * " + n2 + " = " + (n1 * n2) + "\n" + n1 + " / " + n2 + " = " + (n1 / n2) + "\n");
    }
}
