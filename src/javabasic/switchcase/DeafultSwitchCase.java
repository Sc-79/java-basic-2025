package javabasic.switchcase;

import java.util.Scanner;

public class DeafultSwitchCase {
   DeafultSwitchCase( int choice, int a, int b){
       switch (choice){
           case 1:
               System.out.println("Adition = " + (a + b));
               break;
           case 2:
               System.out.println("Subtraction = " + (a - b));
               break;
           case 3:
               System.out.println("Multiplication = " + (a * b));
               break;
           case 4:
               if(b !=0) {
                   System.out.println("Division = " + (a / b));
               }else {
                   System.out.println("Cannot divide by Zero");

               }
               break;
           default:
               System.out.println("Invalit choies");
       }
   }
}

 class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose Operation:");
        System.out.println("1.Add  2.Sub  3.Mul  4.Div");

        int choice = sc.nextInt();

        // Calling constructor
        new DeafultSwitchCase(choice, a, b);
    }
}
