import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scan.nextInt();
    while(num >=10){
      num /=10;
    }
    System.out.println("Leftmost digit: " + num);
  }
}
