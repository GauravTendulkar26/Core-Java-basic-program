
import java.util.Scanner;

class Ascii {
  public static void main(String[] args) {
      char ch;
      System.out.println("Enter the charater");
      Scanner sc = new Scanner(System.in);
      ch = sc.next().charAt(0);
      int a = ch;
      System.out.println("ASCII value of "+ch+ "is "+a);

  }
}