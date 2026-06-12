import java .util.Scanner;
public class loop {
public static void main(String[] args){
    System.out.print("Enter number ");
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<=n;i++){
        System.out.println(i);
    }
}
}