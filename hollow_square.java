import java.util.Scanner;
public class hollow_square{
    public static void main(String args[]){
        System.out.print("enter the number of rows you want:");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.print("enter the number of columns you want:");
        int column = scan.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column;j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}