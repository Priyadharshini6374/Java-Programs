
import java.util.Scanner;
public class evenorodd{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("enter a number:");
        int number =scan.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is an even number");

        }
        else{
            System.out.println("The number is an odd number");
        }
    }
}
