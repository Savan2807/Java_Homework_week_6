import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
public class P13_Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number :- ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number :- ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third number :- ");
        int num3 = scanner.nextInt();
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);
        scanner.close();


    }
}

