import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt(), product = 1;
    while(num > 0){
      product *=num % 10;
      num /=10;
    }
    System.out.println("Product: " + product);
  }
}
