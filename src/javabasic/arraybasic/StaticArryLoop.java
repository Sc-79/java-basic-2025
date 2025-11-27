package javabasic.arraybasic;

public class StaticArryLoop {
   static int[] myNumber = {1,2,43,5,6,7,7,8,8,};

    static void main(String[] args) {
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(myNumber[i]);
        }
    }
}
