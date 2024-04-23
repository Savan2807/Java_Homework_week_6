import java.util.Scanner;

public class P16_Binary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input first binary number
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        // Input second binary number
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Calculate the sum
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Display the result
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is " + binarySum);
    }
}
