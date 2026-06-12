import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are Adult");
        }

        System.out.println("Program Ended");

        sc.close();
    }
}