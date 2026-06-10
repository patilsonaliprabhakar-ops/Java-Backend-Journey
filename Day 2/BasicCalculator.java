import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== TRACK 1: ARITHMETIC CALCULATOR ===");
        
        System.out.print("Enter the first number (Integer): ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number (Decimal): ");
        double num2 = input.nextDouble();
        
        // Performing arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2; 
        
        // Displaying results
        System.out.println("\n--- Calculation Results ---");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println("----------------------------");
        
        input.close();
    }
}