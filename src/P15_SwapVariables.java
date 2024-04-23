import java.util.Scanner;

public class P15_SwapVariables {
    public static void SwapVariables(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first variable:- ");
        int userInput_01 = scanner.nextInt();

        System.out.println("Please enter a second variable:- ");
        int userInput_02 = scanner.nextInt();
        SwapVariables(userInput_01, userInput_02);
    }
}
