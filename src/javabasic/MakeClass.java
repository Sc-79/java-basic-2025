package javabasic;

public class MakeClass {

  String test1 = "This is my test variable";
  public String test2 = "this is my second variable";
  final String test3 = "this is my third variable";
  final Integer sod1 = 34;

}

class Test1{
}


class Test2 {
    void MyMethod() {
        final Integer value = 20;
        for (int i = 0; i <= 20; i++) {
            System.out.println("MyValue is :" + i);
        }
    }

}

class Test4 {
    void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2);
        test2.MyMethod();


    }
}