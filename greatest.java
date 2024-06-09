class greatest {
  // greatest of three number

  public static void main(String[] args) {
      
      int a=40 , b= 60 ,c=10 ;

      if (a>b) {
          if (a>c) {
              System.out.println("a");
          }
          else{
            System.out.println("c");
          }
      }
      else{
          if (b>c) {
            System.out.println("b");
              
          } else {
              System.out.println("c");
          }
  
        }
  }
}