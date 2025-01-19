// 23.12.2024
import java.util.Scanner;
public class Fibbonacci{
    public static void main(String args[]){
        System.out.print(" Enter the limit of series:");
        Scanner scan = new Scanner(System.in);
        int limit= scan.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1);
        System.out.print(n2);
        for(int i=1; i<=limit-2; i++){
            int n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n2);
            
        }
       
    }
}
