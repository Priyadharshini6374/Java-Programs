// 21.12.2024 PDF 1
import java.util.Scanner;
public class positiveornegative{
    public static void main(String args[]){
        System.out.print("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0){
            System.out.println("Its a positive number");
        }
        else if ( number < 0){
            System.out.println("The number is negative");

        }
        else{
            System.out.print("The number is zero");
        }
    }
}