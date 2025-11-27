package javabasic.staticused;

public class StaticNonStatic {
    static  int a = 10;  // no need to ac
    int b = 20;

}

class Test{
    static void main(String[] args) {
        StaticNonStatic obj = new StaticNonStatic();
        System.out.println(obj.b); // need object
        System.out.println(StaticNonStatic.a);  //
    }
}
