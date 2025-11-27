package javabasic.staticused;

public class StaticMethod {

    static int square(int n){
        return n * n;
    }

}

  class Test2{
    static void main(String[] args) {
        System.out.println(StaticMethod.square(20));
    }
}
