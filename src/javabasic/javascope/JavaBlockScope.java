package javabasic.javascope;

public class JavaBlockScope {
    static void main(String[] args) {
//        cannot ues x
//        System.out.println(x);
        {
            /// This is a block of code
//            System.out.println(x);
//            cannot use x
            int x = 20;
//            can use x
            System.out.println(x);
        }
//        cannot ues x
//        System.out.println(x);
    }
}
