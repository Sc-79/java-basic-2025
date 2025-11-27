package javabasic.constructor;

public class Constructor1 {
   static int x = 10;

   Constructor1(int x){
       this.x = x;
   }
}

class Test1{
    static void main(String[] args) {
        Constructor1 myObj = new Constructor1(12);

        System.out.println(myObj.x);

    }
}

class Test2{
//  Constructor1 numobj = new Constructor1();
    static void main(String[] args) {
//        System.out.println(numobj.x);
        System.out.println(Constructor1.x);
    }
}