import java.util.Scanner;
public class Main{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num = sc.nextInt(), sum = 0,temp = num;
  while (temp > 0){
    sum += temp % 10;
    temp /= 10;
  }
  System.out.println(num % sum ==0 ? "Harshad Number" : "Not a Harshad Number");
 }
}
