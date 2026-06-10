
import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // 1. Scanner Initialization for User Input
        Scanner scanner = new Scanner(System.in);
        
        // Constants (Using the 'final' keyword)
        final double TAX_RATE = 0.05; // 5% student activity tax
        
        System.out.println("=== DAY 2: STUDENT INFORMATION SYSTEM ===");
        
        // 2. Variables & Non-Primitive Data Types (String)
        System.out.print("Enter Student Full Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Student ID / Roll Number: ");
        String studentId = scanner.nextLine();
        
        // 3. Primitive Data Types
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter Raw Course Fee ($): ");
        double baseFee = scanner.nextDouble();
        
        System.out.print("Is this student eligible for a scholarship? (true/false): ");
        boolean isEligible = scanner.nextBoolean();
        
        // 4. Operators & Business Logic
        double discount = 0.0;
        if (isEligible) {
            discount = baseFee * 0.15; // 15% discount using Arithmetic Operators
        }
        
        double taxAmount = baseFee * TAX_RATE;
        double finalFee = (baseFee - discount) + taxAmount;
        
        // 5. Type Casting (Explicit/Narrowing: double -> int)
        // Converting final fee to an approximate round whole number
        int roundedFeeAmount = (int) finalFee; 
        
        // Increment Operator Demo (++x vs x++)
        int rank = 5;
        System.out.println("\nProcessing registration sequence...");
        System.out.println("Current processing queue position: " + rank++); // Prints 5, then increments to 6
        System.out.println("Next up in queue position: " + rank);          // Prints 6
        
        // 6. Formatted Output Generation (The Receipt)
        System.out.println("\n=================================");
        System.out.println("       STUDENT FEE RECEIPT       ");
        System.out.println("=================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Age          : " + age + " years old");
        System.out.println("---------------------------------");
        System.out.println("Base Course Fee    : $" + baseFee);
        System.out.println("Scholarship Disc.  : -$" + discount);
        System.out.println("Student Tax (5%)   : +$" + taxAmount);
        System.out.println("---------------------------------");
        System.out.println("Exact Total Due    : $" + finalFee);
        System.out.println("Rounded Amount Due : $" + roundedFeeAmount + " (via Explicit Type Casting)");
        System.out.println("=================================");
        
        // Closing the resource scanner
        scanner.close();
    }
}