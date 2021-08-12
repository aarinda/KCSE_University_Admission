package com.strathmore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your KCSE Grade: ");
        int KCSE_Grade = input.nextInt();

        System.out.println("Please enter your Interview Questions Score: ");
        int Interview_Score = input.nextInt();

        System.out.println("Please enter your Confidence Level Score: ");
        int Confidence_Score = input.nextInt();

        if(KCSE_Grade >= 65)
        {
            if(Interview_Score >= 6 || Confidence_Score >= 5)
                System.out.println("Congratulations, You have been admitted!");
            else
                System.out.println("Sorry, your application was rejected!");
        }
        else
            System.out.println("Sorry, your application was rejected!");
    }
}
