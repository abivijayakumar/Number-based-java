import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt(), product = 1, sum = 0, pos = 1;
    while(num > 0){
      int digit = num % 10;
      if(pos % 2 == 0) product *= digit;
      else sum += digit;
      num /=10;
      pos++;
    }
    System.out.println("product % sum == 0 ? "Divisible" : "Not Divisible");
  }
}
