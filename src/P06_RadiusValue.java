

// Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class P06_RadiusValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a PI value :-");
        double PI = scanner.nextDouble();
        System.out.println("Please enter a R value :-");
        double R = scanner.nextDouble();

        double A = PI*R*R;
        System.out.println("The area of the circle is: " + A);
        scanner.close();
    }
}
