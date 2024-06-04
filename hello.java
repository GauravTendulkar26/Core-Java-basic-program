// import java.util.Scanner;

// class hello{
//   public static void main(String arg[]){
//     System.out.println("Number");
//   Scanner scan = new Scanner(System.in);
//   int choice = scan.nextInt();

//     switch(default){
//       case 1 -> System.out.println("hello");
//       case 2-> System.out.println("Kaise ho");
//     }

//   }
// }


import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        System.out.println("Enter a number (1 or 2):");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Kaise ho");
            default -> System.out.println("Invalid choice, please enter 1 or 2.");
        }
        scan.close();
    }
}
