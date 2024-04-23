
/*Write a Java program that takes a number as input and prints its  multiplication table up to 10.
        Test Data: Input a number: 8*/

import java.util.Scanner;

public class P10_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}