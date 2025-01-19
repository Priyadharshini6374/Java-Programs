// // level 1 (Task 2)
import java.util.Scanner;
public class Palindromechecker {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print(" Enter a string or Phrase: ");
    String given_string=scan.nextLine();
    String reversed_string="";
    String lowercased_string=(given_string.toLowerCase());
    String string_without_spaces=lowercased_string.replace(" ","");
    int stringlength= string_without_spaces.length();
    for(int i=stringlength-1; i>=0; i--){
      char new_string=string_without_spaces.charAt(i);
      reversed_string = reversed_string+ new_string;
    }
    if(reversed_string.equals(string_without_spaces)){
      System.out.print("ITS A PALINDROME");
    }
    else{
      System.out.print("NOT A PALINDROME");
    }
  }
}

    //A man, a plan, a canal: Panama