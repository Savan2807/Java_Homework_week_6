import java.util.Scanner;
//Write a program to calculate the area of a triangl
public class P08_Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area =  base * height;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
