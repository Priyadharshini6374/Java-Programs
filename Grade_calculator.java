// level 1 (Task 3)
import java.util.Scanner;
public class Grade_Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print(" enter no of subject marks:");
        int no_of_subjects=scan.nextInt();

        System.out.println("**** Enter your subject marks ****");
        int sum=0;
        int mark[] = new int[no_of_subjects];

        for(int i=0;i<no_of_subjects;i++){
        System.out.print(" Enter you mark:" );
        mark[i] = scan.nextInt();
        sum = sum+mark[i];
        }

        int average = sum /no_of_subjects;
        if (average>=0 && average<=100){
            if(average>=90 && average<=100){
                System.out.print("Grade A");
            }
            else if(average>=80 && average<=89){
                System.out.print("Grade B");
            }
            else if(average>=70 && average<=79){
                System.out.print("Grade C");
            }
            else if(average>=60 && average<=69){
                System.out.print("Grade C");
            }
            else if(average>=50 && average<=59){
                System.out.print("Grade D");
            }
            else{
                System.out.print("Fail");
            }
        }
        else{
            System.out.print("OOPS!!!!   Enter your correct average marks");
        }

    }
}