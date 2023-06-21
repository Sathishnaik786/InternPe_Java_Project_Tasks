import java.text.DecimalFormat;

public class Circle {
    public static void main(String[] args) {
        double radius = 7.5;

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Calculate the perimeter of the circle
        double perimeter = 2 * Math.PI * radius;

        // Format the results to have 15 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        String formattedArea = decimalFormat.format(area);
        String formattedPerimeter = decimalFormat.format(perimeter);

        // Print the results
        System.out.println("Perimeter is = " + formattedPerimeter);
        System.out.println("Area is = " + formattedArea);
    }
}

