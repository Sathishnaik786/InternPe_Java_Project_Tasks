import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}

