import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        System.out.println("Enter starting no. of do while loop");
        Scanner sc= new Scanner(System.in);
        int strt=sc.nextInt();
        
 System.out.println("Enter Ending no. of do-while loop");
        Scanner sc2= new Scanner(System.in);
        int end =sc2.nextInt();
       
        do{
            System.out.println(strt);
            strt++;
        }while(strt<=end);
    }
}