import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    System.out.print("Enter digit to count: ");
    int target = sc.nextInt(), count = 0;
    while (num > 0){
      if(num % 10 == target)count++;
      num /=10;
    }
    System.out.println("Occurrences: " + count);
  }
}
