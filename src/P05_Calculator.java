
/*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

import static java.lang.System.*;

public class P05_Calculator {

    public static void addition(int a,int b){
        System.out.println("Addition of two number:- "+ (a + b));
    }
    public static void subtraction(int a,int b){
        System.out.println("Subtraction of two number:- " + (a - b));
    }
    public void multiplication(int a,int b){
        out.println("Multiplication of two number:- " + (a * b));
    }
    public void division(int a,int b){
        out.println("Division of two number:- "+ (a / b));
    }

    public static void main(String[] args){
        P05_Calculator p05_calculator = new P05_Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:-");
        int a = scanner.nextInt();
        System.out.println("Enter a secound number:-");
        int b = scanner.nextInt();

        addition(a,b);
        subtraction(a,b);
        p05_calculator.multiplication(a,b);
        p05_calculator.division(a,b);

        scanner.close();
    }
}
