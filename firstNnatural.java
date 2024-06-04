import java.util.Scanner ;
class firstNnatural{

  public static void main(String arg[]){

  int n ;
  System.out.println("Enter the no of term");
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();

  for(int a=1;a<=n;a++){
    if(a % 2 == 0){
    System.out.println(a+" ");

    }
  }
  }
}