package javabasic;

//allow to access userInput;

import java.util.Scanner;

public class ScannerObj {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
       String name =  scanner.nextLine();

        System.out.println("my name is " + name);

        scanner.close();

    }

}
