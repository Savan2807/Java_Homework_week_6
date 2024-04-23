import java.util.Scanner;

public class P17_DecimalBinary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Display the result
        System.out.println("Binary number is: " + binaryNumber);
    }
}
