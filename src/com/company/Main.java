package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int divisor;
        int dividend;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter divisor: ");
            divisor = scanner.nextInt();

            System.out.print("Enter dividend: ");
            dividend = scanner.nextInt();

            System.out.println(divisor + "/" + dividend + "=" + divide(divisor, dividend));
            System.out.println(divisor + "%" + dividend + "=" + mod(divisor, dividend));
    }
    private static int divide(int a, int b) {
        return a/b;
    }

    private static int mod(int a, int b) {
        return a%b;
    }
}
