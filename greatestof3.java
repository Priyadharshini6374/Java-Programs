// 21.12.2024 PDF 1
import java.util.Scanner;
public class greatestof3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        System.out.print("number1:");
        int number1 = scan.nextInt();
        System.out.print("number2:");
        int number2 = scan.nextInt();
        System.out.print("number3:");
        int number3 = scan.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.print("Number1 is greatest of three numbers");
        }
        else if (number2 > number3){
            System.out.print("Number2 is greatest of three numbers");

        }
        else{
            System.out.print("Number3 is greatest of three numbers");
        }
    }
}