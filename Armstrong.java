// 23.12.2024 PDF 3
import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number:");
        int given_number = scan.nextInt();
        int original_number = given_number;
        int number = given_number;
        int product =0;
        int sum = 0;
        int count=0;
        int Result=0; 
        while(number != 0){
            int remainder = number % 10;
            count++;
            number = number/10;

        }
        while(original_number!= 0){
            int rem = original_number % 10; 
            for(int i=1; i <= count;i++){
                product = i*rem;
                sum =sum + product;
            } 
            original_number = original_number/10;
            Result= sum;
        
        }
       
        if (Result == given_number){
            System.out.print(" The given number is an Armstong number");
        }
        else{
            System.out.print(" not an Armstrong Number");
        }


    }
}