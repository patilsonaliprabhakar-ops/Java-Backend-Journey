import java.util.Scanner;
public class While{
    public static void main(String[] args){
        System.out.println("enter starting no.");
    Scanner sc=new Scanner(System.in);
    int strt=sc.nextInt();
    System.out.println("Enter ending no.");
    Scanner sc2 =new Scanner(System.in);
    int end=sc2.nextInt();
    while(strt<=end){
        System.out.println(strt);
        strt++;
    }
    }
}