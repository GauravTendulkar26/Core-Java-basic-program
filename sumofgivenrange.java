// print sum of odd or even in given range  
import java.util.Scanner ;

class sumofgivenrange {
  public static void main(String arg[]){
    int n ,  i , sum = 0;
    System.out.println("Enter the range");
    Scanner r = new Scanner(System.in);
      n = r.nextInt();

      if(n%2 == 0){
          for(i = 0 ; i<=n;i=i+2){
                sum += i ;
          }
          System.out.println("Sum of even number"+sum);
      }
      else{
          for(i=1 ; i<=n ; i=i+2){
            sum += i;
          }
          System.out.println("sum of odd number"+sum);
      }
  }
}