import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt();
    System.out.print("Prime digits:");
    while (num > 0){
      int digit = num % 10;
      if(digit == 2 || digit == 3 || digit == 5 || digit == 7)
        System.out.print(digit + " ");
      num /=10;
    }
  }
}
