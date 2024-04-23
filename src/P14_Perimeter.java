public class P14_Perimeter {
    public static void main(String[] args){
        double width = 5.5;
        double height = 8.5;

        // Calculate area
        double area = width * height;

        // Calculate perimeter
        double perimeter = 2 * (width + height);

        // Display results
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
