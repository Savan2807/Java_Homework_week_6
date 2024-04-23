//Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius ((F − 32) × 5/9 = 0°C).


import java.util.Scanner;

public class P07_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a  Fahrenheit temperature :- ");
        double F = scanner.nextDouble();
        double celsius_temperature = (F - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius_temperature + "°C");
        scanner.close();


    }
}
