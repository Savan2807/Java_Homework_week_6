import java.util.Scanner;

// Write a program to convert the upper case to lower case.
public class P09_UpperCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter string in uppercase:- ");
        String input = scanner.nextLine();

        String lowercaseOutput = input.toLowerCase();
        System.out.println("Converted to lowercase: " + lowercaseOutput);

        scanner.close();

    }
}
