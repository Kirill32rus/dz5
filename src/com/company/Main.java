package com.company;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println();
        int m1 = input.nextInt();
        System.out.println();
        int m2 = input.nextInt();
        System.out.println();
        int m3 = input.nextInt();


        if (m1 > m2 && m1>m3) {
            max = m1;
        } else if (m3>m2 && m3>m1) {
            max = m3;
        } else {
            max = m2;
        }
        if (max > 94 && max < 727) {
            System.out.print(max);
        } else {
            System.out.println("Error");
        }


    }


}











