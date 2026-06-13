import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while(n > 0) {

            int digit = n % 10;

            int fact = 1;

            for(int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;

            n /= 10;
        }

        if(original == sum) {
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not Strong Number");
        }

        sc.close();
    }
}