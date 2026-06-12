import java.util.Scanner;

public class ATM_System{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if(pin == 1234){

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = " + balance);
            }
            else{
                System.out.println("Insufficient Balance");
            }

        }
        else{
            System.out.println("Wrong PIN");
        }
    }
}