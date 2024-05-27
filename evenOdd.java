import java.util.Scanner;

class evenOdd {
  public static void main(String arg[]){
    int a ;
    System.out.println("Enter the any number");
    Scanner sc = new Scanner(System.in);  // take Scanner as object 
    a = sc.nextInt();
    if(a%2==0){
      System.out.println("given number is even");
    }
    else{
            System.out.println("given number is odd");

    }

  }
}