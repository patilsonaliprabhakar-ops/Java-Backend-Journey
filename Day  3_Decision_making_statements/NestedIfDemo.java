import java.util.Scanner;

public class NestedIfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Are you Citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if(age >= 18){

            if(citizen){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Citizen");
            }

        }
        else{
            System.out.println("Under Age");
        }

        sc.close();
    }
}