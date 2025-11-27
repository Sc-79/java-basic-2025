package javabasic.arraybasic;
//using non static create obj
public class ArrayTest1 {

  int [] myNumber = {2,3,4,5,5,66,7,7,88};

    static void main(String[] args) {
        ArrayTest1 myNumber = new ArrayTest1();
        System.out.println(myNumber.myNumber[0]);
        System.out.println(myNumber.myNumber[1]);
        System.out.println(myNumber.myNumber[2]);
        System.out.println(myNumber.myNumber[3]);
        System.out.println(myNumber.myNumber[4]);
        System.out.println(myNumber.myNumber[5]);
    }

}
