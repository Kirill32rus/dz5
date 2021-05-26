package com.company;

import java.util.Scanner;

public class watermelons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 3200;
        System.out.println("n");/// количество арбузов
        int n = input.nextInt();
        int k;
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("k");
            k = input.nextInt();
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        System.out.print("min: "+min);
System.out.print("max: "+max);
}
}