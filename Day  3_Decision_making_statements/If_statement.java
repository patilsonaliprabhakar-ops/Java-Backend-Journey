import java.util.Scanner;
public class If_statement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("voter is valid");}
        else{
            System.out.println("voter is invalid");
        }
        sc.close();
    
    }}