// level 1 (Task 3)
import java.util.Scanner;
public class Temperature_converter{
    public static void main(String args[]){
        System.out.println("Enter number1 for converting Celsius to Fahrenheit");
        System.out.println("Enter number2 for converting  Fahrenheit to Celsius");
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number 1 or 2:");
        int number = scan.nextInt();
        if (number==1 || number==2){
            System.out.print("Enter the value you want to convert:");
            int value = scan.nextInt();
            if(number == 1){
                int fahrenheit =(value*9/5)+32;
                System.out.print("Fahrenheit=" +fahrenheit );
            }
            else if( number == 2){
                int celsius= (value-32)*5/9;
                System.out.print("Celsius=" +celsius);
            }
        }
        else{
            System.out.print(" Enter the correct number in option 1 or 2");
        }
    }
}