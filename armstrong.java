
import java.util.Scanner;


class armstrong {
    public static void main(String[] args) {
        int numb, arm=0, rem, copy ;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        numb = sc.nextInt();
        copy = numb;
        while (numb>0) { 
            rem = numb%10;
            arm =(rem*rem*rem)+arm;
            numb = numb/10;
        }

        if (copy == arm) {
            System.out.println("The given number is "+arm+" "+"armstrong");
        }
    }
}