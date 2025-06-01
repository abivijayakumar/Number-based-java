import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt(), max = 0;
    while(num > 0){
      int digit = num % 10;
      if(digit > max) max = digit;
      num /=10;
    }
    System.out.println("Greatest digit: " + max);
  }
}
