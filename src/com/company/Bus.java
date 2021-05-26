package com.company;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        int n; //колчество мостов
        int v; //высота тунеля
        int count =1;// авария
        int heightBus = 423;


        Scanner input = new Scanner(System.in);
        System.out.println("n");
        n = input.nextInt();

        do {
            System.out.println("v");
            v = input.nextInt();

            if(v<=heightBus){
                System.out.println("crash"+count);
                return;

            }
            count++;



        }

        while(count<=n);
        System.out.println("No crash");

        }



    }

