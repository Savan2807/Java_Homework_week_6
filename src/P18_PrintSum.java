import java.util.Scanner;

public class P18_PrintSum {


    public static void calculations(int a,int b){
       int sum = a + b;
       int multiply = a * b;
       int subtract = a - b;
       int divide = a / b;
       int remainder = a % b;

       System.out.println("sum:- " + a +" + " + b + " = " + sum);
       System.out.println("multiply:- "+ a +" * " + b + " = " + multiply);
       System.out.println("subtract:- "+ a + " - " + b + " = " + subtract );
       System.out.println("dividea:- "+ a + " / " + b + " = " + divide);
       System.out.println("remaindera:- "+ a + " % " + b + " = " + remainder);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:-");
        int a = scanner.nextInt();
        System.out.println("Enter a secound number:-");
        int b = scanner.nextInt();
        calculations(a,b);
        scanner.close();
    }
}
